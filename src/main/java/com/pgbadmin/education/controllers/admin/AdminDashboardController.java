package com.pgbadmin.education.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/admin")
public class AdminDashboardController {
    @GetMapping("/home")
    public String getAdminHome() {
        return "admin/index";
    }

}
