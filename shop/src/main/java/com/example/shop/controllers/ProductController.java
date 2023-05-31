package com.example.shop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {
    @GetMapping("/")
    public String Main() {
        return "main";
    }
    @GetMapping("/product")
    public String Products() {
        return "products";
    }
    @GetMapping("/admin")
    public String Admin() {
        return "admin";
    }
}