package com.malu.springboot.configurationwebserver.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/27 1:02 下午
 */

@Controller
public class LoginController {


    //springBoot 怎么通过xml'的方式进行 注册 web container 的三大组件 servlet  filter listener
   // @PostMapping("/login/user")
    public void login(HttpServletResponse response) throws IOException {

        response.getWriter().write("hi,servlet");


    }
}
