// Main Application Class
package com.cognizant.orm_query_methods_demo;

import com.cognizant.orm_query_methods_demo.model.*;
import com.cognizant.orm_query_methods_demo.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.*;

@SpringBootApplication
public class OrmQueryMethodsDemoApplication1 {

    public static void main(String[] args) {
        SpringApplication.run(OrmQueryMethodsDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner run(EmployeeService employeeService, DepartmentService departmentService,
            SkillService skillService) {
        return args -> {
            // Add Department
            Department dept = new Department();
            dept.setName("IT");
            departmentService.save(dept);

            // Add Skill
            Skill skill = new Skill();
            skill.setName("Java");
            skillService.save(skill);

            // Add Employee
            Employee emp = new Employee();
            emp.setName("John");
            emp.setSalary(50000);
            emp.setPermanent(true);
            emp.setDateOfBirth(new Date());
            emp.setDepartment(dept);
            emp.setSkillList(new HashSet<>(Arrays.asList(skill)));
            employeeService.save(emp);

            // Fetch Employee
            Employee fetched = employeeService.get(emp.getId());
            System.out.println("Employee: " + fetched.getName());
            System.out.println("Department: " + fetched.getDepartment().getName());
            fetched.getSkillList().forEach(s -> System.out.println("Skill: " + s.getName()));
        };
    }
}
