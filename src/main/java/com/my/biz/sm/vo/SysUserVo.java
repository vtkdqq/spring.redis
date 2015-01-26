package com.my.biz.sm.vo;

import java.io.Serializable;
import java.util.Date;

import com.my.biz.sm.commons.util.DateUtil;


public class SysUserVo implements Serializable
{
    private static final long serialVersionUID = -2977080406024774250L;
    private String id;
    private String userName;// 用户名
    private String passworld;// 密码
    private String email;// 邮箱
    private String mobile;// 手机
    private Date createTime;// 创建时间
    private Date updateTime;// 更新时间
    private Date lastLoginTime;// 最后登录时间
    private String lastLoginTimeStr;
    private String userStatus = "-1";// 用户状态

    private int pageNo = 1;
    private int pageSize = 20;
    private int totalCount;
    private int pageTotal;
    
    private Boolean pwdStatus;

    public String getLastLoginTimeStr()
    {
        if (null != lastLoginTime)
        {
            lastLoginTimeStr = DateUtil.formatTime(lastLoginTime);
        }
        return lastLoginTimeStr;
    }

    public void setLastLoginTimeStr(String lastLoginTimeStr)
    {
        this.lastLoginTimeStr = lastLoginTimeStr;
    }

    public int getPageNo()
    {
        return pageNo;
    }

    public void setPageNo(int pageNo)
    {
        this.pageNo = pageNo;
    }

    public int getPageSize()
    {
        return pageSize;
    }

    public void setPageSize(int pageSize)
    {
        this.pageSize = pageSize;
    }

    public int getTotalCount()
    {
        return totalCount;
    }

    public void setTotalCount(int totalCount)
    {
        this.totalCount = totalCount;
    }

    public int getPageTotal()
    {
        return pageTotal;
    }

    public void setPageTotal(int pageTotal)
    {
        this.pageTotal = pageTotal;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getUserName()
    {
        return userName;
    }

    public void setUserName(String userName)
    {
        this.userName = userName;
    }

    public String getPassworld()
    {
        return passworld;
    }

    public void setPassworld(String passworld)
    {
        this.passworld = passworld;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getMobile()
    {
        return mobile;
    }

    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }

    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    public Date getUpdateTime()
    {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime)
    {
        this.updateTime = updateTime;
    }

    public Date getLastLoginTime()
    {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime)
    {
        this.lastLoginTime = lastLoginTime;
    }

    public String getUserStatus()
    {
        return userStatus;
    }

    public void setUserStatus(String userStatus)
    {
        this.userStatus = userStatus;
    }
    
    public Boolean getPwdStatus()
    {
        return pwdStatus;
    }

    public void setPwdStatus(Boolean pwdStatus)
    {
        this.pwdStatus = pwdStatus;
    }
    

    @Override
    public String toString()
    {
        return String
                .format("UserVo [userName=%s, passworld=%s, email=%s, mobile=%s, createTime=%s, updateTime=%s, lastLoginTime=%s, userStatus=%s]",
                        userName, passworld, email, mobile, createTime, updateTime, lastLoginTime, userStatus);
    }

   

}
