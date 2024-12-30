package com.example.serving_web_content.repository;

import com.example.serving_web_content.model.Account;
import com.example.serving_web_content.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {
    Post findPostByPostId(Long id);
}
