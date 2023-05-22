package com.kevinlago.examplewebservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class UIController {
    @GetMapping
    public String getUI() {
        return "index.html";
    }

    @GetMapping("/error")
    public String getErrorPage(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if (status != null) {
            Integer code = Integer.valueOf(status.toString());

            if (code == HttpStatus.NOT_FOUND.value()) {
                return "404.html";
            } else if (code == HttpStatus.UNAUTHORIZED.value()) {
                return "401.html";
            }
        }

        return "unmapped error";
    }
}
