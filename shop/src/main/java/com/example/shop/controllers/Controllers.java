package com.example.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllers {
    @GetMapping("/")
    public String Main() {
        return "main";
    }

    @GetMapping("/admin")
    public String Admin() {
        return "admin";
    }
}