package com.learn.springsecurity.entites;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.Instant;

@Entity
@Table(name =   "tb_tweets")
public class Tweet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tweet_id")
    private Long tweetsId;

    private User user;

        private String content;

        @CreationTimestamp
        private Instant creationTimeStamp;


}
