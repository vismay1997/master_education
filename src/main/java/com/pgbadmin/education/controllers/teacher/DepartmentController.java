package com.pgbadmin.education.controllers.teacher;

import com.pgbadmin.education.models.teacher.Department;
import com.pgbadmin.education.services.teacher.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @GetMapping(path = "create-department")
    public String getCreateDepartment(Model model) {
        model.addAttribute("model", new Department());
        return "teacher/create-edit-department";
    }

    @PostMapping(path = "create-department")
    public String postCreateDepartment(Model model, @ModelAttribute Department department) {
        System.out.println(department);
        Department savedObject = service.saveDepartment(department);
        model.addAttribute("model", department);
        return "teacher/create-edit-department";
    }

    @GetMapping(path = "edit-department/{departmentId}")
    public String getEditDepartment(Model model, @PathVariable(name = "departmentId") Long departmentId) {
        model.addAttribute("model", service.getDepartmentById(departmentId));
        System.out.println(service.getDepartmentById(departmentId));
        return "teacher/create-edit-department";
    }

    @PostMapping(path = "edit-department/{departmentId}")
    public String postEditDepartment(Model model, @ModelAttribute Department department, @PathVariable(name = "departmentId") Long departmentId) {
        System.out.println(department);
        service.saveDepartment(department);
        model.addAttribute("model", department);
        return "teacher/create-edit-department";
    }
}
