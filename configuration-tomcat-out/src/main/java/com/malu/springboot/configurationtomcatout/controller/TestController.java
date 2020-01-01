package com.malu.springboot.configurationtomcatout.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/28 2:55 下午
 */

@Controller
public class TestController {

    @GetMapping("/hello")
    public String sayHi(HttpServletRequest request){

        request.setAttribute("test","sayhi");
        return "success";
    }

}
