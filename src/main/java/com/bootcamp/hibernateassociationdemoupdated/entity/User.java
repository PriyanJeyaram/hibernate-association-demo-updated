package com.bootcamp.hibernateassociationdemo.entity;

import lombok.Data;

@Data
public class User {
    private int userId;
    private String userName;
    private int age;
    private char gender;
}
