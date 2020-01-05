package com.malu.springboot.web.controller;

import com.malu.springboot.web.mvcConfig.Constant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Locale;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/3 7:10 下午
 */

@Controller
public class LoginController {

    @PostMapping("/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpServletRequest request){

        HttpSession session = request.getSession();
        session.removeAttribute("msg");

        if (!StringUtils.isEmpty(username) && "1234".equals(password)) {
            session.setAttribute("user",username);

            return "redirect:/dashboard.html";
        } else {

            String msg = Constant.getMessage("msg1");

            session.setAttribute("msg",msg);

            return "redirect:/";
        }

    }




}
