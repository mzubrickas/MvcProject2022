package eu.codeacademy.skyfly.welcome.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping
    public String hello() {
        return "home/home";
    }

    @GetMapping("/home")
    public String home() {
        return "home/home";
    }
}
