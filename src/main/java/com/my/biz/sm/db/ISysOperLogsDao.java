package com.my.biz.sm.db;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.my.biz.sm.entity.SysOperLogs;

public interface ISysOperLogsDao
{

    int countByExample(SysOperLogsExample example);

    int deleteByExample(SysOperLogsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysOperLogs record);

    int insertSelective(SysOperLogs record);

    List<SysOperLogs> selectByExample(SysOperLogsExample example);

    PageList<SysOperLogs> selectByExample(SysOperLogsExample example, PageBounds pageBounds);

    SysOperLogs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysOperLogs record, @Param("example") SysOperLogsExample example);

    int updateByExample(@Param("record") SysOperLogs record, @Param("example") SysOperLogsExample example);

    int updateByPrimaryKeySelective(SysOperLogs record);

    int updateByPrimaryKey(SysOperLogs record);
}
