package com.my.biz.sm.commons.interceptor;

import java.lang.reflect.Method;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.my.biz.sm.commons.annotation.SysOperaLog;
import com.my.biz.sm.commons.constants.WebConstants;
import com.my.biz.sm.commons.util.SessionUtils;
import com.my.biz.sm.commons.util.SysOperaLogUtil;
import com.my.biz.sm.entity.SysAuditLog;
import com.my.biz.sm.entity.SysOperLogs;
import com.my.biz.sm.service.SysOperLogsViewComp;
import com.my.biz.sm.vo.SysUserVo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.resource.ResourceHttpRequestHandler;


/**
 * 系统操作日志拦截器
 * 
 * @author: stone
 */
public class SysOperaLogInterceptor extends HandlerInterceptorAdapter
{

    private final static Logger log = LoggerFactory.getLogger(SysOperaLogInterceptor.class);

    @Autowired
    private SysOperLogsViewComp sysOperLogsViewComp;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {

        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
            throws Exception
    {

        if (handler instanceof ResourceHttpRequestHandler)
        {
            return;
        }

        try
        {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Method method = handlerMethod.getMethod();
            //通过注解找到需要记录日志的方法
            SysOperaLog sysOperaLog = AnnotationUtils.findAnnotation(method, SysOperaLog.class);
            SysUserVo userVo = SessionUtils.getSessionUser();
            if (null != sysOperaLog && null != userVo)
            {
                SysOperLogs sysOperLogs = new SysOperLogs();
                if (SysOperaLog.Type.EDIT.equals(sysOperaLog.operaType())
                        || SysOperaLog.Type.DEL.equals(sysOperaLog.operaType()) || SysOperaLog.Type.ADD.equals(sysOperaLog.operaType()))
                {
                    sysOperLogs.setNewvalue(SysOperaLogUtil.getNewValue() == null ? "" : SysOperaLogUtil.getNewValue()
                            .toString());
                    sysOperLogs.setOldvalue(SysOperaLogUtil.getOldValue() == null ? "" : SysOperaLogUtil.getOldValue()
                            .toString());
                }

                if (SysOperaLog.Type.AUDIT.equals(sysOperaLog.operaType()))
                {
                    addAuditLog(userVo, sysOperaLog);
                }
                
                sysOperLogs.setOperaDes(SysOperaLogUtil.getOperaDes());
                addLogs(request, sysOperaLog, userVo, sysOperLogs);
            }
        }
        catch (Throwable e)
        {
            log.error("SysOperLogs error..", e);
        }
    }

    private void addAuditLog(SysUserVo userVo, SysOperaLog sysOperaLog)
    {
        SysAuditLog auditlog = new SysAuditLog();
        auditlog.setCreatetime(new Date());
        auditlog.setFlowid(SysOperaLogUtil.getFlowId());
        auditlog.setRemark(SysOperaLogUtil.getAuditRemark());
        auditlog.setFlowType(sysOperaLog.operaDes());
        auditlog.setUserid(Long.valueOf(userVo.getId()));
        auditlog.setUsername(userVo.getUserName());
        sysOperLogsViewComp.addSysAuditLog(auditlog);
    }

    private void addLogs(HttpServletRequest request, SysOperaLog sysOperaLog, SysUserVo userVo, SysOperLogs sysOperLogs)
    {
        sysOperLogs.setOperaDes(sysOperaLog.operaDes()+"  "+(sysOperLogs.getOperaDes()==null?"":sysOperLogs.getOperaDes()));
        sysOperLogs.setOperaType(WebConstants.SYSOPERALOG_TYPE.get(sysOperaLog.operaType()));
        sysOperLogs.setUserid(Long.valueOf(userVo.getId()));
        sysOperLogs.setUsername(userVo.getUserName());
        sysOperLogs.setUrl(request.getRequestURL().toString());
        sysOperLogsViewComp.add(sysOperLogs);
    }

}
