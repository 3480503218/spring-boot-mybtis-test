package com.dhm.mapper;

import com.dhm.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {
    public Employee getEmp(Integer id);
    public void InsertEmp(Employee employee);
}
