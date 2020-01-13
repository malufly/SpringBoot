package com.malu.springboot.cache.bean;

import lombok.Data;

@Data
public class Department {

  private Integer id;
  private String departmentName;

  public Department() {
  }

  public Department(Integer id, String departmentName) {
    this.id = id;
    this.departmentName = departmentName;
  }

  public static Department departmentFactory(){

    Department department = new Department(5,"test");

  return department;

  }

}
