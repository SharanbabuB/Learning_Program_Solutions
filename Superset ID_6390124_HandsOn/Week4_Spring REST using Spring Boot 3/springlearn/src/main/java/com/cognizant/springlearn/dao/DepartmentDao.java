package com.cognizant.springlearn.dao;

import com.cognizant.springlearn.model.Department1;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DepartmentDao {

    private static List<Department1> DEPARTMENT_LIST;

    @SuppressWarnings("unchecked")
    public DepartmentDao() {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("department.xml")) {
            DEPARTMENT_LIST = (List<Department1>) context.getBean("departmentList");
        }
    }

    public List<Department1> getAllDepartments() {
        return DEPARTMENT_LIST;
    }
}
