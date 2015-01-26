package com.my.biz.sm.entity;

import java.io.Serializable;
import java.util.Date;

public class SysOperLogs implements Serializable
{
    private static final long serialVersionUID = 1L;

    private Long id;

    private Long userid;// 操作人Id

    private String username;// 操作人

    private String operaType;// 操作类型

    private String operaDes;// 操作描述

    private String url;// 请求路径

    private String oldvalue;// 旧值

    private String newvalue;// 新值

    private Date createTime;

    // 查询条件
    private String createTimeStart;
    private String createTimeEnd;
    
    public SysOperLogs(){
        
    }
    
    public SysOperLogs(String operaType,String operaDes){
        this.operaType = operaType;
        this.operaDes = operaDes;
    }
    
    public String getCreateTimeStart()
    {
        return createTimeStart;
    }

    public void setCreateTimeStart(String createTimeStart)
    {
        this.createTimeStart = createTimeStart;
    }

    public String getCreateTimeEnd()
    {
        return createTimeEnd;
    }

    public void setCreateTimeEnd(String createTimeEnd)
    {
        this.createTimeEnd = createTimeEnd;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getUserid()
    {
        return userid;
    }

    public void setUserid(Long userid)
    {
        this.userid = userid;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username == null ? null : username.trim();
    }

    public String getOperaType()
    {
        return operaType;
    }

    public void setOperaType(String operaType)
    {
        this.operaType = operaType == null ? null : operaType.trim();
    }

    public String getOperaDes()
    {
        return operaDes;
    }

    public void setOperaDes(String operaDes)
    {
        this.operaDes = operaDes == null ? null : operaDes.trim();
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url == null ? null : url.trim();
    }

    public String getOldvalue()
    {
        return oldvalue;
    }

    public void setOldvalue(String oldvalue)
    {
        this.oldvalue = oldvalue == null ? null : oldvalue.trim();
    }

    public String getNewvalue()
    {
        return newvalue;
    }

    public void setNewvalue(String newvalue)
    {
        this.newvalue = newvalue == null ? null : newvalue.trim();
    }

    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }
}
