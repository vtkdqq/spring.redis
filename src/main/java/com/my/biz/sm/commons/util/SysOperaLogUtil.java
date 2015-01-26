package com.my.biz.sm.commons.util;


import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.my.biz.sm.vo.TopicVo;


public class SysOperaLogUtil
{
    //设置新值与旧值
    public static void setLogsValue(Object oldValue, Object newValue)
    {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
        request.setAttribute("oldValue", oldValue);
        request.setAttribute("newValue", newValue);
    }

    public static Object getOldValue()
    {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
        return request.getAttribute("oldValue");
    }

    public static Object getNewValue()
    {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
        return request.getAttribute("newValue");
    }
    
    public static String getOperaDes()
    {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
        Object obj = request.getAttribute("newValue");
        if(null!=obj)
        {
            Class<?> sourceClass = obj.getClass();
            try
            {
                Method method = sourceClass.getMethod("getSysOperaDes");
                return (String) (method.invoke(obj)==null?"":method.invoke(obj));
            }
            catch (Exception e)
            {
                return "";
            }
        }
        return "";
    }
    
    public static void main(String[] args) throws Throwable
    {
        TopicVo vo = new TopicVo();
        vo.setSysOperaDes("dddddddddd");        
        Class<?> sourceClass = vo.getClass();
        Field field = sourceClass.getDeclaredField("sysOperaDes");
        field.setAccessible(true);
       System.out.println(field.get(vo));
       Method method = sourceClass.getMethod("getSysOperaDes");
       System.out.println(method.invoke(vo, args));
    }
    // 获取流程Id
    public static Long getFlowId()
    {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
        String flowId = request.getParameter("flowId");
        return flowId != null ? Long.valueOf(flowId) : 0;
    }

    // 获取审批意见
    public static String getAuditRemark()
    {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
        return (String) request.getParameter("remark");
    }
}
