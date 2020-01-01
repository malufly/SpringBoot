package com.malu.springboot.datamybatis.pojo;


public class Department {

  private long id;
  private String departmentName;

  public Department() {
  }

  public Department(long id, String departmentName) {
    this.id = id;
    this.departmentName = departmentName;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

}
