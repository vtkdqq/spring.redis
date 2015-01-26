package com.my.biz.sm.entity;

import java.io.Serializable;
import java.util.Date;

import com.my.biz.sm.commons.util.DateUtil;


public class SysAuditLog implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Long id;

    private Long flowid;

    private String remark;

    private String flowType;

    private String username;

    private Long userid;

    private Date createtime;

    private String createtimeStr;

    public String getCreatetimeStr()
    {
        if (null != createtime)
        {
            createtimeStr = DateUtil.formatTime(createtime);
        }
        return createtimeStr;
    }

    public void setCreatetimeStr(String createtimeStr)
    {
        this.createtimeStr = createtimeStr;
    }

    public String getFlowType()
    {
        return flowType;
    }

    public void setFlowType(String flowType)
    {
        this.flowType = flowType;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getFlowid()
    {
        return flowid;
    }

    public void setFlowid(Long flowid)
    {
        this.flowid = flowid;
    }

    public String getRemark()
    {
        return remark;
    }

    public void setRemark(String remark)
    {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username == null ? null : username.trim();
    }

    public Long getUserid()
    {
        return userid;
    }

    public void setUserid(Long userid)
    {
        this.userid = userid;
    }

    public Date getCreatetime()
    {
        return createtime;
    }

    public void setCreatetime(Date createtime)
    {
        this.createtime = createtime;
    }
}
