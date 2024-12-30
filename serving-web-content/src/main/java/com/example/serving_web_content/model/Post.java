package com.example.serving_web_content.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    private String title;
    private String content;
    private String domain;
    private String ageTarget;
    private LocalDate publishedDate;

    public void onCreate() {
        this.publishedDate = LocalDate.now();
    }

    // Getters and setters
    public Long getId() {
        return postId;
    }

    public void setId(Long id) {
        this.postId = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getAgeTarget() {
        return ageTarget;
    }

    public void setAgeTarget(String ageTarget) {
        this.ageTarget = ageTarget;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }
}
