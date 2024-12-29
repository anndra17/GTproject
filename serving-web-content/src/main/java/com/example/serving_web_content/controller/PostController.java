//package com.example.serving_web_content.controller;
//
//import com.example.serving_web_content.model.Post;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//@Controller
//public class PostController {
//
//    @GetMapping("/posts")
//    public String getAllPosts(Model model) {
//        // Aici ar trebui să returnezi lista de postări dintr-un serviciu sau repository
//        model.addAttribute("posts", postService.getAllPosts());
//        return "posts";
//    }
//
//    @GetMapping("/createPost")
//    public String createPostForm() {
//        return "createPost";
//    }
//
//    @PostMapping("/createPost")
//    public String createPost(@RequestParam String title, @RequestParam String content, Model model) {
//        Post post = new Post();
//        post.setTitle(title);
//        post.setContent(content);
//
//        // Salvează postarea într-o bază de date sau într-un serviciu
//        postService.savePost(post);
//
//        return "redirect:/posts";  // După ce ai salvat, redirecționezi către lista de postări
//    }
//}
