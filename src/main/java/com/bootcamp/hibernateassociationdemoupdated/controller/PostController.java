package com.bootcamp.hibernateassociationdemoupdated.controller;

import com.bootcamp.hibernateassociationdemoupdated.entity.Post;
import com.bootcamp.hibernateassociationdemoupdated.entity.User;
import com.bootcamp.hibernateassociationdemoupdated.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @Autowired
    PostService service;

    @PostMapping("/add")
    public ResponseEntity<String> addPost(@RequestBody Post post) {
        service.addPost(post);
        return new ResponseEntity<>("Post Added Successfully :)", HttpStatus.CREATED);
    }
}
