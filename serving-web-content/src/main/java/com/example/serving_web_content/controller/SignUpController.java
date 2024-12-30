package com.example.serving_web_content.controller;

import com.example.serving_web_content.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignUpController {

    @Autowired
    private AccountService accountService;

    // Pagina de Sign Up (Înregistrare)
    @GetMapping("/signup")
    public String signUpForm() {
        return "signup";
    }

    // Procesarea formularului de Sign Up
    @PostMapping("/signup")
    public String signUp(@RequestParam String username, @RequestParam String password) {
        accountService.addUser(username, password); // Adăugăm noul utilizator
        return "redirect:/login"; // După înregistrare, redirecționăm către pagina de login
    }
}
