package com.my.biz.sm.service.impl;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.github.miemiedev.mybatis.paginator.domain.PageList;
import com.my.biz.sm.commons.page.PageConvertor;
import com.my.biz.sm.commons.page.PageData;
import com.my.biz.sm.commons.page.PageParam;
import com.my.biz.sm.db.ISysOperLogsDao;
import com.my.biz.sm.db.SysOperLogsExample;
import com.my.biz.sm.entity.SysOperLogs;
import com.my.biz.sm.service.SysOperLogsMgtService;

@Service(value = "sysOperLogsMgtService")
public class SysOperLogsMgtServiceImpl implements SysOperLogsMgtService
{
    @Autowired
    private ISysOperLogsDao sysOperLogsDao;

    @Override
    public PageData<SysOperLogs> queryOperLogsList(PageParam<SysOperLogs> page)
    {
        PageBounds pageBounds = PageConvertor.toPageBounds(page);
        SysOperLogs sysOperLogs = page.getP();
        SysOperLogsExample example = new SysOperLogsExample();
        SysOperLogsExample.Criteria criteria = example.createCriteria();
        if (null != sysOperLogs)
        {
            if (StringUtils.isNotBlank(sysOperLogs.getCreateTimeStart()))
            {
                example.setCreateTimeStart(sysOperLogs.getCreateTimeStart());
            }
            if (StringUtils.isNotBlank(sysOperLogs.getCreateTimeEnd()))
            {
                example.setCreateTimeEnd(sysOperLogs.getCreateTimeEnd());
            }
            if (StringUtils.isNotBlank(sysOperLogs.getOperaType()))
            {
                criteria.andOperaTypeEqualTo(sysOperLogs.getOperaType());
            }
            if (StringUtils.isNotBlank(sysOperLogs.getUsername()))
            {
                criteria.andUsernameLike("%" + sysOperLogs.getUsername() + "%");
            }
        }
        example.setOrderByClause(" id desc ");
        PageList<SysOperLogs> list = sysOperLogsDao.selectByExample(example, pageBounds);
        return PageConvertor.toPageData(list);
    }

    @Override
    public void add(SysOperLogs sysOperLogs)
    {
        checkNotNull(sysOperLogs);
        sysOperLogs.setCreateTime(new Date());
        sysOperLogsDao.insert(sysOperLogs);
    }

    @Override
    public void delById(Integer id)
    {
        checkNotNull(id);
        sysOperLogsDao.deleteByPrimaryKey(id);
    }

    @Override
    public void updateById(SysOperLogs sysOperLogs)
    {
        checkNotNull(sysOperLogs);
        sysOperLogsDao.updateByPrimaryKey(sysOperLogs);
    }

    @Override
    public SysOperLogs getSysOperLogsById(Integer id)
    {
        checkNotNull(id);
        return sysOperLogsDao.selectByPrimaryKey(id);
    }

}
