package com.juaracoding.eschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    // Thymeleaf
    @GetMapping("/auth/login")
    public String loginPage(Model model) {
        model.addAttribute("title", "Login Page");
        return "base";
    }
}
