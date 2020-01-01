package com.malu.springboot.datajdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/29 5:26 下午
 */

@Controller
public class JDBCtemplateController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @ResponseBody
    @GetMapping("/jdbcTemplate")
    public List testJDBCtemplate(){

        List<Map<String, Object>> maps = jdbcTemplate.queryForList("SELECT * FROM sqlBatchInject");

        return maps;
    }

}
