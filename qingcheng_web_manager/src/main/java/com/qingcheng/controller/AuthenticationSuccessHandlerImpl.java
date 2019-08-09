package com.qingcheng.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qingcheng.pojo.system.LoginLog;
import com.qingcheng.service.system.LoginLogService;
import com.qingcheng.utils.WebUtil;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * @author 炼丹小童子
 * @create 2019-08-07 10:25
 * @name qingcheng_parent - com.qingcheng.controller    Alchemist
 */
public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {
    @Reference
    private LoginLogService loginLogService;

    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {

        //记录登录日志
        LoginLog loginLog = new LoginLog();
        loginLog.setIp(httpServletRequest.getRemoteAddr());
        loginLog.setLocation(WebUtil.getCityByIP(httpServletRequest.getRemoteAddr()));
        loginLog.setBrowserName(WebUtil.getBrowserName(httpServletRequest.getHeader("user-agent")));
        loginLog.setLoginName(authentication.getName());
        loginLog.setLoginTime(new Date());
        loginLogService.add(loginLog);
        //登录成功转发
        httpServletRequest.getRequestDispatcher("/main.html").forward(httpServletRequest,httpServletResponse);
    }
}
