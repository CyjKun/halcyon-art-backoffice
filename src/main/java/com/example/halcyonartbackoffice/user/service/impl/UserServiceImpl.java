package com.example.halcyonartbackoffice.user.service.impl;

import com.example.halcyonartbackoffice.user.api.model.User;
import com.example.halcyonartbackoffice.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    @Override
    public Optional<User> getUser(Integer id) {
        List<User> userList = new ArrayList<>(Arrays.asList(
                new User(1, "CJ", 26, "user@email.com"),
                new User(2, "Ruth", 24, "user1@email.com")
        ));
        return userList.stream()
                .filter(user -> id.equals(user.getId()))
                .findFirst();
    }
}
