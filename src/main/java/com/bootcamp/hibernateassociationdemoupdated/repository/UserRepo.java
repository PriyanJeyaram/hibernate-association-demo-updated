package com.bootcamp.hibernateassociationdemoupdated.repository;

import com.bootcamp.hibernateassociationdemoupdated.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
