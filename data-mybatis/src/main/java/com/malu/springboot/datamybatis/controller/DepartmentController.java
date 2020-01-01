package com.malu.springboot.datamybatis.controller;

import com.malu.springboot.datamybatis.dao.DepartmentDao;
import com.malu.springboot.datamybatis.pojo.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/30 3:54 下午
 */

@RestController
public class DepartmentController {

    @Resource
    DepartmentDao departmentDao;

    @GetMapping("/department")
    public List<Department> listDepartments(){

        return departmentDao.listDepartment();
    }


    @GetMapping("/department/{id}")
    public Department getDepartment(@PathVariable("id") Integer id){

        return  departmentDao.getDepartmentById(id);
    }

    @GetMapping("/department/{id}/{username}")
    public boolean addDepartment(@PathVariable("id") Integer id,
                                 @PathVariable("username") String username){

        return departmentDao.addDepartment(new Department(id,username));
    }

    @GetMapping("/department/del/{id}")
    public boolean delDepartment(@PathVariable("id")Integer id){

        return departmentDao.delDepartment(id);
    }

    @GetMapping("/department/update/{id}/{username}")
    public boolean updateDepartment(@PathVariable("id") Integer id,
                                    @PathVariable("username") String username){

        Department department = new Department(id, username);
        return departmentDao.updateDepartment(department);
    }


}
