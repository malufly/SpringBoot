package com.malu.springboot.configurationinjectprofile.bean;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/19 5:46 下午
 */

public class Dog {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
