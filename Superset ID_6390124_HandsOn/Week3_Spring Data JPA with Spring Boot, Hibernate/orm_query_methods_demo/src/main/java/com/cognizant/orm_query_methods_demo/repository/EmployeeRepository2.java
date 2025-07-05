package com.cognizant.orm_query_methods_demo.repository;

import com.cognizant.orm_query_methods_demo.entity.Employee2;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository2 extends JpaRepository<Employee2, Integer> {

    @Query("SELECT e FROM Employee2 e WHERE e.permanent = true")
    List<Employee2> getAllPermanentEmployees();

    @Query("SELECT e FROM Employee2 e LEFT JOIN FETCH e.department d LEFT JOIN FETCH e.skillList WHERE e.permanent = true")
    List<Employee2> getAllPermanentEmployeesWithFetch();

    @Query("SELECT AVG(e.salary) FROM Employee2 e WHERE e.department.id = :id")
    double getAverageSalary(@Param("id") int departmentId);

    @Query(value = "SELECT * FROM employee2", nativeQuery = true)
    List<Employee2> getAllEmployeesNative();
}
