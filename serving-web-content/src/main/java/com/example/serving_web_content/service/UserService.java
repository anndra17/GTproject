package com.example.serving_web_content.service;

import com.example.serving_web_content.model.Account;
import com.example.serving_web_content.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public void addUser(String username, String password) {
        Account newAccount = new Account();
        newAccount.setUsername(username);
        newAccount.setPassword(password);
        userRepository.save(newAccount);
    }

    public Account getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
