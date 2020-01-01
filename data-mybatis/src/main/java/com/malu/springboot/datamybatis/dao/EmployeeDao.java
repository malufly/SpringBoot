package com.malu.springboot.datamybatis.dao;

import com.malu.springboot.datamybatis.pojo.Employee;


import java.util.List;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/30 6:39 下午
 */

public interface EmployeeDao {

    List<Employee> listEmployee();

    Employee getEmployee(Integer id);

    boolean addEmployee(Employee employee);

    boolean updateEmployee(Employee employee);

    boolean delEmployee(Integer id);
}
