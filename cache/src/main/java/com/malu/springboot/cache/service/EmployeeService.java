package com.malu.springboot.cache.service;

import com.malu.springboot.cache.bean.Employee;
import com.malu.springboot.cache.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/6 7:45 下午
 */

public interface EmployeeService {


    List<Employee> listEmplyee();

    Employee getEmployeeById(Integer id);

    Employee addEmployee(Employee employee);

    void delEmployee(Integer id);

    Employee updateEmpooyee (Employee employee);




}
