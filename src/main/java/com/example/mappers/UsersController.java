package com.example.mappers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/users")
@RestController
public class UsersController {

    private List<User> users = List.of(new User("Miztli", 30), new User("Dan", 60));

    @GetMapping
    public List<User> findAll() {
        return users;
    }
}
