package com.example.halcyonartbackoffice.api.controller;

import com.example.halcyonartbackoffice.api.model.User;
import com.example.halcyonartbackoffice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    //todo create an interface for this (cleancode)
    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;

    }
    @GetMapping
    public User getUser(@RequestParam Integer id) {
        //todo create a resource
        //todo create failure endpoints
        Optional user = userService.getUser(id);
        if(user.isPresent()){
            return (User) user.get();
        }
        return null;
    }
}
