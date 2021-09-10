package com.billy.department.controller;


import com.billy.department.entity.Department;
import com.billy.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
  private DepartmentService departmentService;

    @PostMapping("/")
    public Department getDepartment(@RequestBody Department department){
        log.info("inside save department methood of the DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("inside the findByDepartmentId in the DepartmentController");
        return departmentService.findDepartmentById(departmentId);
    }

}
