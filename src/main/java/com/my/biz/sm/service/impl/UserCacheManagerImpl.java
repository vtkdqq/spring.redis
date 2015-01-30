package com.my.biz.sm.service.impl;

import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import redis.clients.jedis.Response;
import redis.clients.jedis.Transaction;

import com.my.biz.sm.commons.redis.JedisProxy;
import com.my.biz.sm.commons.string.StringUtil;
import com.my.biz.sm.commons.util.CacheUtils;
import com.my.biz.sm.controller.UserInfoController;
import com.my.biz.sm.entity.UserInfo;
import com.my.biz.sm.service.IUserCacheManager;

@Service("userCacheManager")
public class UserCacheManagerImpl implements IUserCacheManager
{
    private final static Logger log = LoggerFactory.getLogger(UserCacheManagerImpl.class);
    
    public static final String USER_PREFIX = "user_";

    public static final String CACHE_USER_ITEM_ID = USER_PREFIX + "ui";

    public static final String CACHE_USER_LOGIN_COUNT = USER_PREFIX + "u_l";

    public static final String CACHE_TOPIC_REPORT = USER_PREFIX + "t_r";

    @Override
    public UserInfo getUser(Integer userId)
    {
        return JedisProxy.getLRUCache().get(CacheUtils.genKey(CACHE_USER_ITEM_ID, userId), UserInfo.class);
    }

    @Override
    public void flushUser(UserInfo userInfo, boolean isClean)
    {
        if (isClean)
        {
            JedisProxy.getLRUCache().del(CacheUtils.genKey(CACHE_USER_ITEM_ID, userInfo.getId()));
        }
        else
        {
            JedisProxy.getLRUCache().set(CacheUtils.genKey(CACHE_USER_ITEM_ID, userInfo.getId()), userInfo);
        }
    }

    @Override
    public void incrUserLoginCount(Integer userId)
    {
        // Persist连接
        JedisProxy.getPersistCache().incr(CacheUtils.genKey(CACHE_USER_LOGIN_COUNT, userId));
    }

    @Override
    public int getUserLoginCount(Integer userId)
    {
        String count = JedisProxy.getPersistCache().get(CacheUtils.genKey(CACHE_USER_LOGIN_COUNT, userId));
        return StringUtil.convertInt(count, 0);
    }

    @Override
    public int increUserReportCount(Long userId, int count)
    {
        Long newCount = JedisProxy.getPersistCache().hincrBy(CACHE_TOPIC_REPORT, String.valueOf(userId), count);
        return newCount.intValue();
    }

    @Override
    public int getUserReportCount(Long userId)
    {
        return StringUtil.convertInt(JedisProxy.getPersistCache().hget(CACHE_TOPIC_REPORT, String.valueOf(userId)), 0);
    }

    @Override
    public void setUserInfoRank(String userid)
    {
        Transaction tx = JedisProxy.getLRUCache().multi();

        for (int i = 0; i < 10; i++)
        {
            tx.watch("userid");
            Response<Long> rid = tx.incr("userid");
            System.out.println("----------------------->" + rid);
            tx.set("t" + rid, "t" + i);
        }
        tx.exec();

        // Long count=JedisProxy.getPersistCache().incr("userid");
        // JedisProxy.getPersistCache().set(userid , "id:"+count);
    }

    

}
