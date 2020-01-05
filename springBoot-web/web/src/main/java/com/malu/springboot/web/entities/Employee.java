package com.malu.springboot.web.entities;

import lombok.Data;

import java.util.Date;

@Data
public class Employee {

	private Integer id;
    private String lastName;

    private String email;
    //1 male, 0 female
    private Integer gender;
    private Department department;
    private Date birth;


	
}
