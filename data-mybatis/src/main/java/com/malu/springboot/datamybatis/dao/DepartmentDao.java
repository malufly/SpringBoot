package com.malu.springboot.datamybatis.dao;

import com.malu.springboot.datamybatis.pojo.Department;
import com.malu.springboot.datamybatis.pojo.Employee;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/30 3:23 下午
 */
@Mapper //如果是文件包可以不加这个注解但是要在Application上加上 mapperScan注解 实现mapper的批量扫描
public interface DepartmentDao {


    @Select("select * from department")
     List<Department> listDepartment();

    @Select("select * from department where id = #{id}")
    Department getDepartmentById(Integer id);

    @Options(useGeneratedKeys = true,keyColumn = "id",keyProperty = "id")
    @Insert("INSERT INTO department(ID, DEPARTMENTNAME) VALUES(#{id},#{departmentName})")
    boolean addDepartment(Department department);

    @Delete("delete from department where id = #{id}")
    boolean delDepartment(Integer id);

    @Update("UPDATE department SET departmentName = #{departmentName} where id = #{id}")
    boolean updateDepartment(Department department);


}
