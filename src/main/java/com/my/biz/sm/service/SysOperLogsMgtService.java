package com.my.biz.sm.service;

import com.my.biz.sm.commons.page.PageData;
import com.my.biz.sm.commons.page.PageParam;
import com.my.biz.sm.entity.SysOperLogs;

/**
 * 系统操作日志
 * 
 * @author stone
 */
public interface SysOperLogsMgtService
{
    /**
     * 列表
     * 
     * @param page
     * @return
     */
    public PageData<SysOperLogs> queryOperLogsList(PageParam<SysOperLogs> page);

    /**
     * 新增
     * 
     * @param sysOperLogs
     */
    public void add(SysOperLogs sysOperLogs);

    /**
     * 根据id删除
     * 
     * @param id
     */
    public void delById(Integer id);

    /**
     * 根据id修改
     * 
     * @param sysOperLogs
     */
    public void updateById(SysOperLogs sysOperLogs);

    /**
     * 根据id查询日志
     * 
     * @param id
     * @return
     */
    SysOperLogs getSysOperLogsById(Integer id);
}
