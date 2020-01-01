package com.malu.springboot.datamybatis.pojo;


public class Employee {

  private long id;
  private String lastName;
  private String email;
  private long gender;
  private long dId;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public long getGender() {
    return gender;
  }

  public void setGender(long gender) {
    this.gender = gender;
  }


  public long getDId() {
    return dId;
  }

  public void setDId(long dId) {
    this.dId = dId;
  }

}
