package com.pgbadmin.education.handlers;

import com.pgbadmin.education.utility.CommonKeywords;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    public String goToErrorPage(Exception exception, Model model) {
        model.addAttribute(CommonKeywords.ERROR_MESSAGE, "Server Error Found");
        model.addAttribute(CommonKeywords.ERROR_DESCRIPTION, exception.getMessage());
        return "common/error";
    }
}
