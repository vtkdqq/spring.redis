package com.my.biz.sm.db;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.my.biz.sm.entity.SysAuditLog;

public interface ISysAuditLogDao
{
    int countByExample(SysAuditLogExample example);

    int deleteByExample(SysAuditLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SysAuditLog record);

    int insertSelective(SysAuditLog record);

    List<SysAuditLog> selectByExample(SysAuditLogExample example);

    SysAuditLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SysAuditLog record, @Param("example") SysAuditLogExample example);

    int updateByExample(@Param("record") SysAuditLog record, @Param("example") SysAuditLogExample example);

    int updateByPrimaryKeySelective(SysAuditLog record);

    int updateByPrimaryKey(SysAuditLog record);
}
