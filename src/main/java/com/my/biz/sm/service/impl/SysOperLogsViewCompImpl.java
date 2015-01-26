package com.my.biz.sm.service.impl;


import java.util.List;

import com.my.biz.sm.commons.page.Page;
import com.my.biz.sm.commons.page.PageData;
import com.my.biz.sm.commons.page.PageParam;
import com.my.biz.sm.commons.util.SessionUtils;
import com.my.biz.sm.entity.SysAuditLog;
import com.my.biz.sm.entity.SysOperLogs;
import com.my.biz.sm.service.SysAuditLogMgtService;
import com.my.biz.sm.service.SysOperLogsMgtService;
import com.my.biz.sm.service.SysOperLogsViewComp;
import com.my.biz.sm.vo.SysUserVo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class SysOperLogsViewCompImpl implements SysOperLogsViewComp
{
    @Autowired
    private SysOperLogsMgtService sysOperLogsMgtService;

    @Autowired
    private SysAuditLogMgtService sysAuditLogMgtService;

    @Override
    public PageData<SysOperLogs> queryOperLogsList(Page page, SysOperLogs sysOperLogs)
    {
        PageParam<SysOperLogs> param = new PageParam<SysOperLogs>(sysOperLogs, page.getPageNo(), page.getPageSize());
        return sysOperLogsMgtService.queryOperLogsList(param);
    }

    @Override
    public void add(SysOperLogs sysOperLogs)
    {
        SysUserVo userVo = SessionUtils.getSessionUser();
        sysOperLogs.setUserid(Long.valueOf(userVo.getId()));
        sysOperLogs.setUsername(userVo.getUserName());
        sysOperLogsMgtService.add(sysOperLogs);
    }

    @Override
    public void addSysAuditLog(SysAuditLog log)
    {
        sysAuditLogMgtService.add(log);
    }

    @Override
    public List<SysAuditLog> querySysAuditLogByFlowId(Long flowId)
    {
        return sysAuditLogMgtService.querySysAuditLogByFlowId(flowId);
    }
}
