package com.malu.springboot.datamybatis.controller;

import com.malu.springboot.datamybatis.dao.EmployeeDao;
import com.malu.springboot.datamybatis.pojo.Employee;
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
 * @date 2019/12/30 7:42 下午
 */
@RestController
public class EmployeeController {

    @Resource
    EmployeeDao employeeDao;

    @GetMapping("/employee")
    public List<Employee> listEmployee(){

        return employeeDao.listEmployee();
    };

    @GetMapping("/employee/{id}")
    public Employee getEmployee(@PathVariable("id")Integer id){

        return employeeDao.getEmployee(id);
    }

    @GetMapping("/employee/{gender}/{lastName}/{email}/{dId}")
    public boolean addEmployee(@PathVariable("lastName")String lastName,
                               @PathVariable("email")String email,
                               @PathVariable("dId")Integer dId,
                               @PathVariable("gender")Integer gender){

        Employee employee = new Employee();
        employee.setLastName(lastName);
        employee.setGender(gender);
        employee.setEmail(email);
        employee.setDId(dId);

        return employeeDao.addEmployee(employee);
    }

    @GetMapping("/employee/{id}/{gender}/{lastname}/{email}/{dId}")
    public boolean updateEmployee(@PathVariable("id") Integer id,
                                  @PathVariable("gender")Integer gender,
                                  @PathVariable("lastname")String lastname,
                                  @PathVariable("dId") Integer dId,
                                  @PathVariable("email")String email){
        Employee employee = new Employee();
        employee.setLastName(lastname);
        employee.setGender(gender);
        employee.setEmail(email);
        employee.setDId(dId);
        employee.setId(id);

        return employeeDao.updateEmployee(employee);
    }

    @GetMapping("/employee/del/{id}")
    public boolean delEmployee(@PathVariable("id") Integer id){
        return employeeDao.delEmployee(id);
    }



}
