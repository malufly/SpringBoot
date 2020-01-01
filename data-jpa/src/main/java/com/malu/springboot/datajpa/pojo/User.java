package com.malu.springboot.datajpa.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/1 4:10 下午
 */

@Entity
@Table
public class User {

    public User() {

    }

    public User(Integer id, String name, Integer age){
        this.id = id;
        this.name = name;
        this.age = age;
    }



    @Id
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer age;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
