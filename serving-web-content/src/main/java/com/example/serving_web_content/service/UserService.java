package com.example.serving_web_content.service;

import com.example.serving_web_content.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final List<User> users = new ArrayList<>();

    public UserService() {
        // Hardcoding two users
        User user1 = new User();
        user1.setUsername("admin");
        user1.setPassword("123");

        User user2 = new User();
        user2.setUsername("user");
        user2.setPassword("123");

        users.add(user1);
        users.add(user2);
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getUserByUsername(String username) {
        return users.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }
}
