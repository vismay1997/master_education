package com.pgbadmin.education.controllers.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/home")
public class HomeController {
    @GetMapping("/index")
    public String getHomePage() {
        return "home/index";
    }
}

