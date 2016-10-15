package com.example.service;

import com.example.model.Employee;
import com.example.model.PageResult;

/**
 * Created by Arpit on 15-10-2016.
 */
public interface EmployeeService {

    public boolean save(Employee employee);

    public boolean update(Employee employee);

    public boolean remove(String email);

    public PageResult<Employee> getAll();

    public Employee get(String email);
}
