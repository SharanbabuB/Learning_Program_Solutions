package com.cognizant.springlearn.service;

import com.cognizant.springlearn.dao.EmployeeDao;
import com.cognizant.springlearn.Employee2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService1 {

    @Autowired
    private EmployeeDao employeeDao;

    @Transactional
    public List<Employee2> getAllEmployees() {
        return employeeDao.getAllEmployees();
    }
}
