package com.example.serving_web_content.controller;

import com.example.serving_web_content.model.Account;
import com.example.serving_web_content.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private AccountService accountService;

    @GetMapping("/")
    public String home() {
        return "redirect:/index.html";
    }

    @GetMapping("/login")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        Account account = accountService.getUserByUsername(username);

        if (account != null && account.getPassword().equals(password)) {
            model.addAttribute("username", username);
            return "posts";  // pagina de succes dupa login
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login";  // se revine la formularul de login
        }
    }
}
