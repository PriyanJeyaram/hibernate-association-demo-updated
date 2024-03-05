package com.bootcamp.hibernateassociationdemoupdated.service;

import com.bootcamp.hibernateassociationdemoupdated.entity.Post;
import com.bootcamp.hibernateassociationdemoupdated.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService{

    @Autowired
    PostRepo repo;

    @Override
    public void addPost(Post post) {
        repo.save(post);
    }
}
