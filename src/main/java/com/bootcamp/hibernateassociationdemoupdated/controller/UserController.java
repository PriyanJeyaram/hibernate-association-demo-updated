package com.bootcamp.hibernateassociationdemoupdated.controller;

import com.bootcamp.hibernateassociationdemoupdated.entity.User;
import com.bootcamp.hibernateassociationdemoupdated.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user1")
public class UserController {

    @Autowired
    UserService service;


    @PostMapping("/add")
    public ResponseEntity<String> addUser(@RequestBody User user) {
        service.addUser(user);
        return new ResponseEntity<>("User Added Successfully :)", HttpStatus.CREATED);
    }
}
