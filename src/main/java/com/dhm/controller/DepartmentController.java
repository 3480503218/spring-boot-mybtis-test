package com.dhm.controller;

import com.dhm.bean.Department;
import com.dhm.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    public DepartmentMapper departmentMapper;
    @RequestMapping("/dept/{id}")
    public Department getDep(@PathVariable("id") Integer id){
        return departmentMapper.getDeptById(id);
    }

    @RequestMapping("/dept")
    public int insertDep(Department department){
        return departmentMapper.insertDept(department);
    }
}
