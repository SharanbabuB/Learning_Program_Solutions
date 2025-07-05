package com.cognizant.orm_query_methods_demo.repository;

import com.cognizant.orm_query_methods_demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
