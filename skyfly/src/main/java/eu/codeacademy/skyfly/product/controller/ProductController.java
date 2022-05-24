package eu.codeacademy.skyfly.product.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class ProductController {

    @GetMapping("/register")
    public String register() {
        return "register/register";
    }
}
