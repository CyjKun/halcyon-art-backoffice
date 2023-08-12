package com.example.halcyonartbackoffice.api.model;

import lombok.Data;

@Data
public class User {
    private int id;
    private String name;
    private int age;
    private String email;

    public User(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }
}
