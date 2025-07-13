package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.Employee2;
import com.cognizant.springlearn.service.EmployeeService1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController1 {

    private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeController1.class);

    @Autowired
    private EmployeeService1 employeeService;

    // Changed endpoint to avoid conflict with another controller
    @GetMapping("/employees-v2")
    public List<Employee2> getAllEmployees() {
        LOGGER.debug("START: getAllEmployees");
        List<Employee2> list = employeeService.getAllEmployees();
        LOGGER.debug("END: getAllEmployees");
        return list;
    }
}
