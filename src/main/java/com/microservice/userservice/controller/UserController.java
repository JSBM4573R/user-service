package com.microservice.userservice.controller;

import com.microservice.userservice.entity.User;
import com.microservice.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public User saveUser(User user) {
        log.info("Inside saveUser of UserController");
        return userService.saveUser(user);
    }
}
