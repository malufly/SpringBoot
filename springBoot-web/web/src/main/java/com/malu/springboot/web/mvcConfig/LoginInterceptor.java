package com.malu.springboot.web.mvcConfig;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/4 5:28 下午
 */
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        HttpSession session = request.getSession();
        Object user = session.getAttribute("user");

        if (user != null) {
            return true;
        } else {
            session.setAttribute("msg","请先登录");
            response.sendRedirect("/");
            return false;
        }

    }
}
