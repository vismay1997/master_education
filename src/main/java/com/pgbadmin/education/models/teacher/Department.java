package com.pgbadmin.education.models.teacher;

import com.pgbadmin.education.handlers.Auditable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Arrays;

@Entity
public class Department extends Auditable<String> {

    @Id
    @GeneratedValue
    private Long department_id;

    private String departmentName;

    private String description;

    private byte[] departmentLogo;

    public Long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Long department_id) {
        this.department_id = department_id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getDepartmentLogo() {
        return departmentLogo;
    }

    public void setDepartmentLogo(byte[] departmentLogo) {
        this.departmentLogo = departmentLogo;
    }

    @Override
    public String toString() {
        return "Department{" +
                "department_id=" + department_id +
                ", departmentName='" + departmentName + '\'' +
                ", description='" + description + '\'' +
                ", departmentLogo=" + Arrays.toString(departmentLogo) +
                '}';
    }
}
