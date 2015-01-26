package com.my.biz.sm.vo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TopicVo implements Serializable
{
    /**
     * serialVersionUID
     */
    private static final long serialVersionUID = 9040859928678640988L;

    private Long id;

    private String sysTags;

    private Integer pastSysTag;

    // 标题
    private String title;

    // 正文
    private String content;

    // 系统标签
    private Integer sysTag;

    // 用户标签
    private Integer userTag;

    // 点击量
    private Integer clickCount;

    // 浮动点击量
    private Integer adjustClickCount;

    // 参与量
    private Integer joinCount;

    // 收藏量
    private Integer collectCount;

    // 是否屏蔽
    private Boolean hidden;

    // 删除标识
    private Boolean deleted;

    // 发表时间
    private Date createTime;

    private String createTimes;

    // 回复量

    private Integer replyCount;

    private String sysOperaDes;// 系统日志描述

    public String getSysOperaDes()
    {
        sysOperaDes = title;
        return sysOperaDes;
    }

    public void setSysOperaDes(String sysOperaDes)
    {
        this.sysOperaDes = sysOperaDes;
    }

    public String getSysTags()
    {
        return sysTags;
    }

    public void setSysTags(String sysTags)
    {
        this.sysTags = sysTags;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getContent()
    {
        return content;
    }

    public void setContent(String content)
    {
        this.content = content;
    }

    public Integer getSysTag()
    {
        return sysTag;
    }

    public void setSysTag(Integer sysTag)
    {
        this.sysTag = sysTag;
    }

    public Integer getUserTag()
    {
        return userTag;
    }

    public void setUserTag(Integer userTag)
    {
        this.userTag = userTag;
    }

    public Integer getPastSysTag()
    {
        return pastSysTag;
    }

    public void setPastSysTag(Integer pastSysTag)
    {
        this.pastSysTag = pastSysTag;
    }

    public Integer getClickCount()
    {
        return clickCount;
    }

    public void setClickCount(Integer clickCount)
    {
        this.clickCount = clickCount;
    }

    public Integer getAdjustClickCount()
    {
        return adjustClickCount;
    }

    public void setAdjustClickCount(Integer adjustClickCount)
    {
        this.adjustClickCount = adjustClickCount;
    }

    public Integer getJoinCount()
    {
        return joinCount;
    }

    public void setJoinCount(Integer joinCount)
    {
        this.joinCount = joinCount;
    }

    public Integer getCollectCount()
    {
        return collectCount;
    }

    public void setCollectCount(Integer collectCount)
    {
        this.collectCount = collectCount;
    }

    public Boolean getHidden()
    {
        return hidden;
    }

    public void setHidden(Boolean hidden)
    {
        this.hidden = hidden;
    }

    public Boolean getDeleted()
    {
        return deleted;
    }

    public void setDeleted(Boolean deleted)
    {
        this.deleted = deleted;
    }

    public Date getCreateTime()
    {
        return createTime;
    }

    public void setCreateTime(Date createTime)
    {
        this.createTime = createTime;
    }

    public Integer getReplyCount()
    {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount)
    {
        this.replyCount = replyCount;
    }

    public String getCreateTimes()
    {
        return createTimes;
    }

    public void setCreateTimes(String createTimes)
    {
        this.createTimes = createTimes;
    }
}
