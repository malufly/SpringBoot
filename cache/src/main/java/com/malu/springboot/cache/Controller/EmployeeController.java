package com.malu.springboot.cache.Controller;

import com.malu.springboot.cache.bean.Department;
import com.malu.springboot.cache.bean.Employee;
import com.malu.springboot.cache.mapper.EmployeeMapper;
import com.malu.springboot.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/6 8:44 下午
 */
@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    private Employee employeeFactory() {

        Employee employee = new Employee();
        employee.setBirth(new Date(System.currentTimeMillis()));
        employee.setEmail("@ssss");
        employee.setGender(0);
        employee.setId(2);
        Department department = new Department();
        department.setId(1);
        employee.setDepartment(department);

        return employee;

    }

    @GetMapping("/employee/list")
    public List<Employee> listEmployee() {
        List<Employee> employees = employeeService.listEmplyee();

        return employees;
    }

    @GetMapping("employee/list/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id) {

        Employee employee = employeeService.getEmployeeById(id);
        return employee;
    }

    @GetMapping("employee/add")
    public String addEmployee() {
        Employee employee = employeeFactory();
        employeeService.addEmployee(employee);
        return "add";
    }

    @GetMapping("employee/del/{id}")
    public String  delEmployee(@PathVariable("id") Integer id) {
        employeeService.delEmployee(id);
        return "delete";
    }


    @GetMapping("/employee/update")
    public String editEmplyee(){
        Employee employee = employeeFactory();
        employee.setEmail("@update");
        employeeService.updateEmpooyee(employee);
        return "edit";
    }
}
