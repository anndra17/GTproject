package com.example.serving_web_content.controller;

import com.example.serving_web_content.model.Post;
import com.example.serving_web_content.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/posts")
    public String getAllPosts(Model model) {
        model.addAttribute("posts", postService.getAllPosts());
        return "posts";
    }

    @GetMapping("/add-post")
    public String createPostForm() {
        return "add-post";
    }

    @PostMapping("/add-post")
    public String createPost(@RequestParam String title, @RequestParam String content, @RequestParam String ageTarget, @RequestParam String domain, Model model) {
        Post post = new Post();
        post.setTitle(title);
        post.setContent(content);
        post.setAgeTarget(ageTarget);
        post.setDomain(domain);
        postService.savePost(post);

        return "redirect:/posts";
    }
}
