package eu.codeacademy.skyfly.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("login-skyfly")
    public String openLoginPage() {
        return "login/login";
    }

}
