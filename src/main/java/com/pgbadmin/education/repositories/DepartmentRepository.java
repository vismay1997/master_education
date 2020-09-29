package com.pgbadmin.education.repositories;

import com.pgbadmin.education.models.teacher.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
