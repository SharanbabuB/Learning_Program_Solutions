package com.cognizant.springlearn.dao;

import org.springframework.stereotype.Repository;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

import com.cognizant.springlearn.Employee2;

@Repository
public class EmployeeDao {

    private static ArrayList<Employee2> EMPLOYEE_LIST;

    @SuppressWarnings("unchecked")
    public EmployeeDao() {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("employee1.xml")) {
            EMPLOYEE_LIST = (ArrayList<Employee2>) context.getBean("employeeList1");
        } catch (Exception e) {
            System.err.println("Error loading employee1.xml: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public List<Employee2> getAllEmployees() {
        return EMPLOYEE_LIST;
    }
}
