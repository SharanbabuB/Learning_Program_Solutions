package com.cognizant.orm_query_methods_demo;

import com.cognizant.orm_query_methods_demo.service.EmployeeService2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class OrmQueryMethodsDemoApplication2 {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmQueryMethodsDemoApplication2.class, args);
        EmployeeService2 service = context.getBean(EmployeeService2.class);

        service.printAllPermanentEmployees();
        service.printAllEmployeesNative();
    }
}
