package com.malu.springboot.quickstartspringinit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/18 8:11 下午
 */


@RestController
public class HelloController {

    @RequestMapping("/hi")
    public String sayHello(){

        return "hello";
    }

}
