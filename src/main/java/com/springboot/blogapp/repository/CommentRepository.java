package com.springboot.blogapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.blogapp.models.Comment;

public interface CommentRepository extends MongoRepository<Comment, String> {

}
