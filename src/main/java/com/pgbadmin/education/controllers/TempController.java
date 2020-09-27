package com.pgbadmin.education.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempController {
    @GetMapping("/")
    public String getHome(){
        return "common/index";
    }
    @GetMapping("/admin")
    public String getAdminHome(){
        return "admin/index";
    }

    @GetMapping("/student")
    public String getStudentHome(){
        return "student/index";
    }

    @GetMapping("/login")
    public String getLogin(){
        return "common/login";
    }

    @GetMapping("/error-page")
    public String getErrorPage(){
        return "common/error";
    }
}
