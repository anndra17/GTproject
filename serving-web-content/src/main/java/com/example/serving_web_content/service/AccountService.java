package com.example.serving_web_content.service;

import com.example.serving_web_content.model.Account;
import com.example.serving_web_content.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;


    public void addUser(String username, String password) {
        Account newAccount = new Account();
        newAccount.setUsername(username);
        newAccount.setPassword(password);
        accountRepository.save(newAccount);
    }

    public Account getUserByUsername(String username) {
        return accountRepository.findByUsername(username);
    }
}
