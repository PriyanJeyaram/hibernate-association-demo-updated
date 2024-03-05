package com.bootcamp.hibernateassociationdemoupdated.service;

import com.bootcamp.hibernateassociationdemoupdated.entity.Address;
import com.bootcamp.hibernateassociationdemoupdated.entity.User;
import com.bootcamp.hibernateassociationdemoupdated.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepo repository;

    @Override
    public void addUser(User user) {
        repository.save(user);
    }
}
