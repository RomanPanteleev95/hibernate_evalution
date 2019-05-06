package com.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping(value = { "/", "/notProtected" })
    public String notProtectedPage(Model model) {
        return "notProtected";
    }

    @GetMapping("/adminPage")
    public String adminPage(Model model) {
        return "adminPage";
    }

    @GetMapping("/userPage")
    public String userPage(Model model) {
        return "userPage";
    }

}
