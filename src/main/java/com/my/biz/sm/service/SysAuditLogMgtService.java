package com.my.biz.sm.service;

import java.util.List;

import com.my.biz.sm.entity.SysAuditLog;


public interface SysAuditLogMgtService
{
    /**
     * 根据流程ID;查询审批记录
     * 
     * @param flowId
     * @return
     */
    public List<SysAuditLog> querySysAuditLogByFlowId(Long flowId);

    /**
     * 新增一条审批记录
     * 
     * @param log
     */
    public void add(SysAuditLog log);
}
