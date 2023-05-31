package com.example.shop.controllers;

import com.example.shop.models.Product;
import com.example.shop.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/product")
    public String products(Model model) {
        model.addAttribute("products", productService.listProducts());
        return "products";
    }

    @PostMapping("/product/create")
    public String createProduct(Product product) {
        productService.createProduct(product);
        return "/product";
    }

    @PostMapping("/product/delete/{id}")
    public String deleteProductByID(@PathVariable int id) {
        productService.deleteProductByID(id);
        return "redirect:/product";
    }
}