package com.cognizant.orm_query_methods_demo.repository;

import com.cognizant.orm_query_methods_demo.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
