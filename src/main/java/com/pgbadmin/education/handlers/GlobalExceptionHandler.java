package com.pgbadmin.education.handlers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public ModelAndView goToErrorPage() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("common/error");
        return mav;
    }
}
