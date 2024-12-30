package com.example.serving_web_content.repository;

import com.example.serving_web_content.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<Account,Long> {
    Account findByUsername(String username);
}
