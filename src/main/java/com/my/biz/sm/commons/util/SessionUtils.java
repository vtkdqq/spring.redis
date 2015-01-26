package com.my.biz.sm.commons.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.my.biz.sm.commons.constants.WebConstants;
import com.my.biz.sm.vo.SysUserVo;

public class SessionUtils
{

    // 获得session
    public static final HttpSession getSession()
    {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
        HttpSession session = request.getSession();
        return session;
    }

    public static SysUserVo getSessionUser()
    {
        return (SysUserVo) getSession().getAttribute(WebConstants.SESSION_USER);
    }

    public static void removeSessionUser()
    {
        getSession().removeAttribute(WebConstants.SESSION_USER);
    }

    public static void setSessionUser(SysUserVo vo)
    {
        getSession().setAttribute(WebConstants.SESSION_USER, vo);
    }
}
