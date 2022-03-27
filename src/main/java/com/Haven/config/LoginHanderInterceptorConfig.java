package com.Haven.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHanderInterceptorConfig implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object loginMessage = request.getSession().getAttribute("loginMessage");
        if (loginMessage != null) return true;
        request.setAttribute("loginMessage", "没有权限,请先登录!");
        request.getRequestDispatcher("/index.html").forward(request, response);
        return false;
    }
}
