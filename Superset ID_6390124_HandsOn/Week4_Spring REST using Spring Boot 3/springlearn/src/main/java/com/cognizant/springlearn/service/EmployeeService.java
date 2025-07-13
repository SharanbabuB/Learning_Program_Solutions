package com.cognizant.springlearn.service;

import com.cognizant.springlearn.model.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @SuppressWarnings("unchecked")
    public List<Employee> getAllEmployees() {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("employee.xml")) {
            return (List<Employee>) context.getBean("employeeList");
        }
    }

    public Employee getEmployeeById(int id) {
        return getAllEmployees().stream()
                .filter(e -> e.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
