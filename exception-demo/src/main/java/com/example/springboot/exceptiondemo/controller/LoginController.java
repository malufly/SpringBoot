package com.example.springboot.exceptiondemo.controller;

import com.example.springboot.exceptiondemo.config.MyLoginException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/26 9:42 下午
 */
@Controller
public class LoginController {

    @PostMapping("/dashboard.html")
    public String login(){

        throw new MyLoginException("登陆出错了");

    }
}
