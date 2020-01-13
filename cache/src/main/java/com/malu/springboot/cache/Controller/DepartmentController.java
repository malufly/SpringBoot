package com.malu.springboot.cache.Controller;

import com.malu.springboot.cache.bean.Department;
import com.malu.springboot.cache.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/6 9:24 下午
 */
@RestController
public class DepartmentController {


    @Autowired
    DepartmentService departmentService;

    @GetMapping("/department/list")
    public List<Department> listDepartment() {

        return departmentService.listDepartment();
    }

    @GetMapping("/department/list/{id}")
    public Department listDepartmentById(@PathVariable("id") Integer id) {

        return departmentService.getDepartmentById(id);
    }

    @GetMapping("/department/add")
    public String addDepartment() {
        Department department = Department.departmentFactory();

        departmentService.addDepartment(department);
        return "add";
    }

    @GetMapping("/department/del/{id}")
    public String delDepartmentByiD(@PathVariable("id") Integer id){

        departmentService.delDepartment(id);
        return "del";
    }

    @GetMapping("/department/update")
    public String updateDepartment(){

        Department department = Department.departmentFactory();
        department.setId(3);
        department.setDepartmentName("testCache");
        departmentService.updateDepartment(department   );
        return "update";
    }
}
