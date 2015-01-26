package com.my.biz.sm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.biz.sm.db.ISysAuditLogDao;
import com.my.biz.sm.db.SysAuditLogExample;
import com.my.biz.sm.entity.SysAuditLog;
import com.my.biz.sm.service.SysAuditLogMgtService;


@Service(value = "sysAuditLogMgtService")
public class SysAuditLogMgtServiceImpl implements SysAuditLogMgtService
{
    @Autowired
    private ISysAuditLogDao sysAuditLogDao;

    @Override
    public List<SysAuditLog> querySysAuditLogByFlowId(Long flowId)
    {
        SysAuditLogExample example = new SysAuditLogExample();
        example.setOrderByClause(" id desc ");
        example.createCriteria().andFlowidEqualTo(flowId);
        return sysAuditLogDao.selectByExample(example);
    }

    @Override
    public void add(SysAuditLog log)
    {
        sysAuditLogDao.insert(log);
    }

}
