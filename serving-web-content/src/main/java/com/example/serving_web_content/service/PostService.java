package com.example.serving_web_content.service;

import com.example.serving_web_content.model.Post;
import com.example.serving_web_content.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public void savePost(Post post) {
        Post newPost = new Post();
        newPost.setContent(post.getContent());
        newPost.setDomain(post.getDomain());
        newPost.setTitle(post.getTitle());
        newPost.setAgeTarget(post.getAgeTarget());
        newPost.onCreate();
        postRepository.save(newPost);
    };

    public List<Post> getAllPosts() {
        return postRepository.findAll(Sort.by(Sort.Direction.DESC, "publishedDate"));
    };

    public void deletePost(Long id) {
        postRepository.deleteById(id);
    }

}
