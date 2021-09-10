package com.billy.department.controller;


import com.billy.department.entity.Department;
import com.billy.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
  private DepartmentService departmentService;

    @PostMapping("/")
    public Department getDepartment(Department department){
        return departmentService.saveDepartment(department);
    }

}
