package com.pgbadmin.education.controllers.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/student")
public class StudentDashboardController {
    @GetMapping("/home")
    public String getStudentHome() {
        return "student/index";
    }
}
