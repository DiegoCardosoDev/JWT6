CREATE TABLE tb_tweets (
    tweet_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BINARY(16),
    content TEXT,
    creation_timestamp TIMESTAMP
);
