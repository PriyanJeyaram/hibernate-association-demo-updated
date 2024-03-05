package com.bootcamp.hibernateassociationdemoupdated.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "myprojects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long projectId;
    private String projectTitle;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "projects")
    private Set<Employee> employees = new HashSet<>();
}
