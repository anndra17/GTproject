package com.example.spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// This class handles web requests
@RestController
public class PostsController {

    // Face ca functia index sa fie apelata la root
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
