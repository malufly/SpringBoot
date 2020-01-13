package com.malu.springboot.cache.service.imp;


import com.malu.springboot.cache.bean.Employee;
import com.malu.springboot.cache.mapper.EmployeeMapper;
import com.malu.springboot.cache.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/6 8:00 下午
 */
@CacheConfig(cacheNames = {"employeeServiceImp"})
@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Autowired
    CacheManager cacheManager;

    public void clearCache(Object key) {
        cacheManager.getCache("employeeServiceImp").evict(key);
    }

    @Override
    @Cacheable(key = "#root.targetClass" )
    public List<Employee> listEmplyee() {
        List<Employee> employees = employeeMapper.selectAll();

        return employees;
    }

    @Override
    @Cacheable(key = "#id")
    public Employee getEmployeeById(Integer id) {

        Employee employee = employeeMapper.selectEmployeeById(id);

        return employee;
    }

    @Override
    @CachePut(key = "#employee.id")
    public Employee addEmployee(Employee employee) {

        employeeMapper.addEmployee(employee);
        clearCache(this.getClass());
        return employee;
    }

    @Override
    @CacheEvict(key = "#id" ,beforeInvocation = true)
    public void delEmployee(Integer id) {
        clearCache(this.getClass());
        employeeMapper.deleteEmployeeById(id);
    }

    @Override
    public Employee updateEmpooyee(Employee employee) {

        employeeMapper.updateEmployee(employee);
        clearCache(this.getClass());
        return employee;
    }
}
