package com.pgbadmin.education.controllers.teacher;

import com.pgbadmin.education.models.common.Page;
import com.pgbadmin.education.models.common.PagingRequest;
import com.pgbadmin.education.models.teacher.Department;
import com.pgbadmin.education.services.teacher.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(path = "teacher")
public class DepartmentController {

    @Autowired
    private DepartmentService service;

    @GetMapping(path = "create-department")
    public String getCreateDepartment(Model model) {
        model.addAttribute("model", new Department());
        return "teacher/create-edit-department";
    }

    @PostMapping(path = "/create-department")
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

    @GetMapping(path = "search-department")
    public String getSearchDepartment(Model model) {
        return "teacher/search-department";
    }

    @PostMapping(path = "ajax-search-department")
    @ResponseBody
    public Page<Department> postAjaxDepartment(@RequestBody PagingRequest pagingRequest) {
        return service.getAllDepartments(pagingRequest);
    }

}
