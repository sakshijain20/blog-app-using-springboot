package com.springboot.blogapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.springboot.blogapp.models.Blog;

public interface BlogRepository extends MongoRepository<Blog, String> {

}
