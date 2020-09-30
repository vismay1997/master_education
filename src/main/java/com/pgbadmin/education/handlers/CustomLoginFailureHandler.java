package com.pgbadmin.education.handlers;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CustomLoginFailureHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException exception) throws IOException, ServletException {
        String message = "";

        if (exception.getClass() == UsernameNotFoundException.class) {
            message = "cannot find a user";
        } else if (exception.getClass() == BadCredentialsException.class) {
            message = "check your password";
        }
        httpServletResponse.sendRedirect("/access/login?error" + message);
    }
}
