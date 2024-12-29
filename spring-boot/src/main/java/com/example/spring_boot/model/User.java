package com.example.spring_boot.model;

public class User {
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
