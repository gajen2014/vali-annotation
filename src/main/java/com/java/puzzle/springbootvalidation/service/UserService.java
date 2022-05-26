package com.java.puzzle.springbootvalidation.service;

import com.java.puzzle.springbootvalidation.dto.LoginRequest;
import com.java.puzzle.springbootvalidation.entity.User;
import com.java.puzzle.springbootvalidation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }


    @PostMapping("/register")
    public String loginUser(LoginRequest loginRequest) {
        User findUser = userRepository.findByEmailAndPassword(loginRequest.getEmail(),loginRequest.getPassword());
        return findUser != null ? "valid User":"invalid User";

    }
}
