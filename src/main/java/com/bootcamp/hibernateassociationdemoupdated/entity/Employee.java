package com.bootcamp.hibernateassociationdemoupdated.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "myemployees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    private String firstName;
    private String lastName;

    @ManyToMany
    @JoinTable(
            name = "myemployees_projects",
            joinColumns = @JoinColumn(name="employeeId"),
            inverseJoinColumns = @JoinColumn(name="projectId")
    )
    private Set<Project> projects = new HashSet<>();
}
