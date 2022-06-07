package eu.codeacademy.skyfly.product.controller;

import eu.codeacademy.skyfly.product.dto.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class ProductController {

    @GetMapping("/register")
    public String register() {
        return "register/register";
    }

    @GetMapping("/flights")
    public String flight() {
        return "flights/flights";
    }

    @GetMapping("/search")
    public String search() {
        return "search/search";
    }

//    @GetMapping
//    public String openCrateProductForm(Model model) {
//        model.addAttribute("product", ProductDto.builder().build());
//        return "fragments/layout";
//    }


}