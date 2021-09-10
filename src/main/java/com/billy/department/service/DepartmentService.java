package com.billy.department.service;


import com.billy.department.entity.Department;
import com.billy.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("inside the saveDepartment of the DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        log.info("inside the findByDepartmentId of the DepartmentService");
        return departmentRepository.findByDepartmentId(departmentId);
    }
}
