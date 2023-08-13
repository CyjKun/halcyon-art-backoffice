package com.example.halcyonartbackoffice.user.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private int age;
    private String email;

}
