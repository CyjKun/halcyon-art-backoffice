package com.example.halcyonartbackoffice.user.service;

import com.example.halcyonartbackoffice.user.api.model.User;

import java.util.Optional;

public interface UserService {
    Optional<User> getUser(Integer id);
}
