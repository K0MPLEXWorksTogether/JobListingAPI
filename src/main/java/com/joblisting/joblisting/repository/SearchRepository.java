package com.joblisting.joblisting.repository;

import java.util.List;

import com.joblisting.joblisting.model.Post;

public interface SearchRepository {

    List<Post> findByText(String text);

}
