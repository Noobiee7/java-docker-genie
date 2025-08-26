package com.example.mypkg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Products";
    }

    @GetMapping("/DockerProducts")
    public String dockerProducts() {
        return "Products";
    }
}

