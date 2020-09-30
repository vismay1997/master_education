package com.pgbadmin.education.controllers.common;

import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/access")
public class AccessManagementController {

    @GetMapping(path = "/login")
    public String getLogin(@RequestParam(value = "error", required = false) String error,
                           @RequestParam(value = "logout", required = false) String logout,
                           Model model) {

        if (error != null) {
            model.addAttribute("error", "Invalid username/password");
        }

        if (logout != null) {
            model.addAttribute("message", "Logged out");
        }
        return "common/login";
    }
}
