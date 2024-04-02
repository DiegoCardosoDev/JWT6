package com.learn.springsecurity.repository;

import com.learn.springsecurity.entites.Tweet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Long> {
    // Métodos do repositório aqui
}

