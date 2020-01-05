package com.malu.springboot.web.controller;

import com.malu.springboot.web.entities.Department;
import com.malu.springboot.web.entities.Employee;
import com.malu.springboot.web.mapper.DepartmentMapper;
import com.malu.springboot.web.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/3 9:17 下午
 */

@Controller
public class EmployeeController {

    @Resource
    EmployeeMapper employeeMapper;

    @Resource
    DepartmentMapper departmentMapper;

    @GetMapping("/employee.html")
    public String listEmployee(HttpServletRequest request) {

        List<Employee> employees = employeeMapper.listEmployee();

        request.setAttribute("employees", employees);

        return "list";
    }

    @GetMapping("/employee")
    public String toAddEmployee(HttpServletRequest request) {

        List<Department> departments = departmentMapper.listDepartment();
        request.setAttribute("departments", departments);

        return "edit";
    }


    @GetMapping("/employee/{id}")
    public String toEditEmployee(HttpServletRequest request,
                                 @PathVariable("id") Integer id) {

        Employee employee = employeeMapper.getEmployee(id);
        List<Department> departments = departmentMapper.listDepartment();
        request.setAttribute("employee", employee);
        request.setAttribute("departments", departments);
        return "edit";
    }

    @DeleteMapping("/employee/{id}")
    public String delEmployee(@PathVariable("id") Integer id) {

        employeeMapper.delEmployeeById(id);
        return "redirect:/employee.html";
    }

    @PostMapping("/employee")
    public String addEmployee(Employee employee) {

        employeeMapper.addEmployee(employee);
        return "redirect:/employee.html";
    }

    @PutMapping("/employee")
    public String updateEmpoyee(Employee employee) {

        employeeMapper.updateEmployee(employee);
        return "redirect:/employee.html";
    }
}
