package com.example.serving_web_content.model;

import java.time.LocalDate;

public class Post {
    private Long id;

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
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
