package com.juaracoding.eschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    // Thymeleaf
    @GetMapping("/dashboard")
    public String dashboardPage(Model model) {
        model.addAttribute("title", "Dashboard");
        return "pages/dashboard";
    }
}

