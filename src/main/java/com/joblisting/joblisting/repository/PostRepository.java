package com.joblisting.joblisting.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.joblisting.joblisting.model.Post;

public interface PostRepository extends MongoRepository<Post,String>
{

}
