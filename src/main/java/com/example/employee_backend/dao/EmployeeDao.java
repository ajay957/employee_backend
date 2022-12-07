package com.example.employee_backend.dao;

import com.example.employee_backend.model.Employees;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employees,Integer> {
    @Query(value = "SELECT `id`, `com_name`, `designation`, `emp_code`, `emp_name`, `mob_no`, `password`, `salary`, `username` FROM `employees` WHERE `emp_code`= :empcode",nativeQuery = true)
    List<Employees> SearchEmployee(@Param("empcode") Integer empcode);
}
