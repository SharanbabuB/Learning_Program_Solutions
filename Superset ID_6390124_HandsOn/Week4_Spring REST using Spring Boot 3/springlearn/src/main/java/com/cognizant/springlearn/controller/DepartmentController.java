package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Department1;
import com.cognizant.springlearn.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public List<Department1> getAllDepartments() {
        return departmentService.getAllDepartments();
    }
}
