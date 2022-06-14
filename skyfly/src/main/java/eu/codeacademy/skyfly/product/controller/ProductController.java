package eu.codeacademy.skyfly.product.controller;
import eu.codeacademy.skyfly.product.dto.ProductDto;
import eu.codeacademy.skyfly.product.entity.Product;
import eu.codeacademy.skyfly.product.helper.MessageService;
import eu.codeacademy.skyfly.product.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping
public class ProductController {

    private final ProductService productService;

    private final MessageService messageService;

    @GetMapping("/register")
    public String register() {
        return "register/register";
    }

//    @GetMapping("/flights")
//    public String flight() {
//        return "flights/flights";
//    }

//    @GetMapping("/search")
//    public String search() {
//        return "search/search";
//    }

    @GetMapping("/flights")
    public String openCrateProductForm(Model model) {
        model.addAttribute("product", Product.builder().build());

        return "flights/flights";
    }

    @PostMapping
    public String createProduct(Model model, ProductDto product) {
        productService.addProduct(product);
        model.addAttribute("message", "Product added successfully!");
        return "flights/flights";
    }

    @GetMapping("/search")
    public String getProducts(Model model) {
        model.addAttribute("productList", productService.getProducts());

        return "search/search";
    }

}