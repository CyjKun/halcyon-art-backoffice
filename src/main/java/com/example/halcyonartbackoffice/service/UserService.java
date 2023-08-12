package com.example.halcyonartbackoffice.service;

import com.example.halcyonartbackoffice.api.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private List<User> userList = new ArrayList<>(Arrays.asList(
            new User(1, "CJ", 26, "user@email.com"),
            new User(2, "Ruth", 24, "user1@email.com")
    ));

    public Optional<User> getUser(Integer id) {
        return userList.stream()
                .filter(user -> id.equals(user.getId()))
                .findFirst();
    }
}
