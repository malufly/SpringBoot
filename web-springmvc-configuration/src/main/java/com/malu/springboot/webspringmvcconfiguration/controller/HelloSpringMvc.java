package com.malu.springboot.webspringmvcconfiguration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/22 7:24 下午
 */

@Controller
public class HelloSpringMvc {


    @RequestMapping("/hi")
    public String helloSpringMvc() {

        return "hello";
    }


}
