package com.my.biz.sm.service;


import java.util.List;

import com.my.biz.sm.commons.page.Page;
import com.my.biz.sm.commons.page.PageData;
import com.my.biz.sm.entity.SysAuditLog;
import com.my.biz.sm.entity.SysOperLogs;


/**
 * 系统操作日志
 * 
 * @author stone
 */
public interface SysOperLogsViewComp
{
    /**
     * 列表
     * 
     * @param page
     * @return
     */
    public PageData<SysOperLogs> queryOperLogsList(Page page, SysOperLogs sysOperLogs);

    /**
     * 新增
     * 
     * @param sysOperLogs
     */
    public void add(SysOperLogs sysOperLogs);

    /**
     * 添加审批日志
     * 
     * @param log
     */
    void addSysAuditLog(SysAuditLog log);

    /**
     * 根据流程Id；查询审核记录
     * 
     * @param flowId
     * @return
     */
    List<SysAuditLog> querySysAuditLogByFlowId(Long flowId);
}
