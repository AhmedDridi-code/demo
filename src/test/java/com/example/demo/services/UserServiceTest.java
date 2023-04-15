/*
package com.example.demo.services;

import com.example.demo.entities.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {
    @Autowired
    UserService userService;

    @Test
    void userShouldBeNotNull() {
        //given
        User user = new User(null,"ahmed");

        //when
        User newUser = userService.createUser(user);

        //then
        assertNotNull(newUser);

    }

    @Test
    void listUsersShouldBeNotNull() {
        //given
        User user = new User(null,"ahmeddridi");
        //when
        User newUser = userService.createUser(user);
        List<User> users = userService.listUsers();
        //then
        assertNotNull(users);
        assert (users.size() > 0);

    }
}*/
