package com.example.serving_web_content.model;

import jakarta.persistence.*;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long accountId;
    private String username;
    private String password;

    //Getters and setters
    public void setUsername(String username) {
        this.username=username;
    }
    public String getUsername(){
        return username;
    }

    public void setPassword(String password) {
        this.password=password;
    }
    public String getPassword() {
        return password;
    }

}
