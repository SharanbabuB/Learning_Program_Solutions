package com.cognizant.orm_query_methods_demo.service;

import com.cognizant.orm_query_methods_demo.entity.Employee2;
import com.cognizant.orm_query_methods_demo.repository.EmployeeRepository2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService2 {

    @Autowired
    private EmployeeRepository2 repository;

    public void printAllPermanentEmployees() {
        List<Employee2> list = repository.getAllPermanentEmployeesWithFetch();
        System.out.println("---- HQL Permanent Employees ----");
        list.forEach(e -> {
            System.out.println("Employee: " + e.getName());
            System.out.println("Skills: " + e.getSkillList());
        });
    }

    public void printAllEmployeesNative() {
        List<Employee2> list = repository.getAllEmployeesNative();
        System.out.println("---- Native Query Employees ----");
        list.forEach(e -> System.out.println("Employee: " + e.getName()));
    }

    public double getAverageSalaryByDepartment(int id) {
        return repository.getAverageSalary(id);
    }
}
