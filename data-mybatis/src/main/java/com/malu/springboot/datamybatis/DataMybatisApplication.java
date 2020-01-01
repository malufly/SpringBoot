package com.malu.springboot.datamybatis;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@MapperScan("classpath:mybatis/mapper/*.xml")
//@MapperScan("classpath:mybatis/mapper/*.xml")
@MapperScan(basePackages = {"com.malu.springboot.datamybatis.dao"})
@SpringBootApplication
public class DataMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataMybatisApplication.class, args);
    }

}
