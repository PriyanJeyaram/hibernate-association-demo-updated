package com.bootcamp.hibernateassociationdemoupdated.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user1")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String userName;
    private int age;
    private char gender;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;
}
