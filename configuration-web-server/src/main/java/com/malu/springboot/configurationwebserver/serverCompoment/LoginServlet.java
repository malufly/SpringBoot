package com.malu.springboot.configurationwebserver.serverCompoment;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/27 1:07 下午
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.getWriter().write("hello,my configuration Servlet");

    }
}
