package eu.codeacademy.skyfly.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @GetMapping("/register")
    public String register() {
        return "register/register";
    }

    @GetMapping("/flights")
    public String flight() {
        return "flights/flights";
    }

}