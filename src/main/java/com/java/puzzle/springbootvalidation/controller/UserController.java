package com.java.puzzle.springbootvalidation.controller;

import com.java.puzzle.springbootvalidation.dto.LoginRequest;
import com.java.puzzle.springbootvalidation.entity.User;
import com.java.puzzle.springbootvalidation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> addUser(@RequestBody @Valid User user) {
        User userResponse = userService.createUser(user);
        return new ResponseEntity<User>(userResponse, HttpStatus.CREATED);

    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody @Valid  LoginRequest loginRequest){
        String validUser = userService.loginUser(loginRequest);
        return new ResponseEntity<>(validUser,HttpStatus.OK);
    }



}