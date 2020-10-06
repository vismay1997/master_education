package com.pgbadmin.education.services.teacher;

import com.pgbadmin.education.models.common.Page;
import com.pgbadmin.education.models.common.PagingRequest;
import com.pgbadmin.education.models.teacher.Department;
import com.pgbadmin.education.repositories.teacher.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.Optional;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Optional<Department> getDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId);
    }

    public Page<Department> getAllDepartments(PagingRequest pagingRequest) {
        Page<Department> departmentPage = new Page<>();
        departmentPage.setData(departmentRepository.findAll());
        departmentPage.setRecordsTotal(departmentRepository.findAll().size());
        return departmentPage;
    }
}
