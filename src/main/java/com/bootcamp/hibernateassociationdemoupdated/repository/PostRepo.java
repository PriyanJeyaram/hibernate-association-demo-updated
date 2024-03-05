package com.bootcamp.hibernateassociationdemoupdated.repository;

import com.bootcamp.hibernateassociationdemoupdated.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Long> {
}
