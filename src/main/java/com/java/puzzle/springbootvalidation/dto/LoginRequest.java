package com.java.puzzle.springbootvalidation.dto;

import com.java.puzzle.springbootvalidation.annotation.ValidUser;
import lombok.Data;

@Data
public class LoginRequest {

    @ValidUser(message = "Email id: ${validatedValue} is not present in the DB.")
    private String email;
    private String password;}