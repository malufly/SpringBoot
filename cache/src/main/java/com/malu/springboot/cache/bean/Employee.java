package com.malu.springboot.cache.bean;

import lombok.Data;

import java.sql.Date;

@Data
public class Employee {

  private Integer id;
  private String lastName;
  private String email;
  private Integer gender;
  private Department department;
  private Date birth;

  public Employee() {
  }

  public Employee(Integer id, String lastName, String email, Integer gender, Department department, Date birth) {
    this.id = id;
    this.lastName = lastName;
    this.email = email;
    this.gender = gender;
    this.department = department;
    this.birth = birth;
  }
}
