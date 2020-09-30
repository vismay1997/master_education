package com.pgbadmin.education.controllers.common;

import com.pgbadmin.education.utility.CommonKeywords;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CommonController {

    @GetMapping("/access-denied")
    public String getAccessDeniedPage(Model model) {
        model.addAttribute(CommonKeywords.ERROR_MESSAGE, "Access Denied !!");
        model.addAttribute(CommonKeywords.ERROR_DESCRIPTION, "You do not Have Permission To View Current Page");
        return "common/error";
    }

    @GetMapping("/home")
    public String getHomePage() {
        return "home/index";
    }
}
