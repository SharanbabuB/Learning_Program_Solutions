package com.cognizant.springlearn;

import com.cognizant.springlearn.model.Employee1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringLearnApplication7 {
    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication7.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication7.class, args);
        displayEmployees();
    }

    @SuppressWarnings("unchecked")
    public static void displayEmployees() {
        LOGGER.info("START");

        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("employee1.xml")) {
            List<Employee1> employees = (List<Employee1>) context.getBean("employeeList1");
            for (Employee1 emp : employees) {
                LOGGER.debug("Employee: {}", emp);
            }
        }

        LOGGER.info("END");
    }

}
