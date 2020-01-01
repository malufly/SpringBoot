package com.malu.springboot.datajpa.reponsity;


import com.malu.springboot.datajpa.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/1 2:53 下午
 */

public interface UserReponsity extends JpaRepository<User,Integer> {

}
