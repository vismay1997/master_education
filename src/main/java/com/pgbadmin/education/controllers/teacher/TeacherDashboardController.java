package com.pgbadmin.education.controllers.teacher;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teacher")
public class TeacherDashboardController {
    @GetMapping("/home")
    public String getTeacherHome() {
        return "teacher/home";
    }
}
