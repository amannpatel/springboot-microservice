package com.dailycodebuffer.department_service.controller;

import com.dailycodebuffer.department_service.model.Department;
import com.dailycodebuffer.department_service.repository.DepartmentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/department")
public class DepartmentController {

    private static final Logger LOGGER
            = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentRepository departmentRepository;

    @PostMapping
    public Department add(@RequestBody Department department){
        return departmentRepository.addDepartment(department);
    }

    @GetMapping
    public List<Department> findAll(){
        return departmentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable Long id){
        return departmentRepository.findById(id);
    }
}
