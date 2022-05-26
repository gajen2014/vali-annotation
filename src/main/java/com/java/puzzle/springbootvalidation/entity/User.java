package com.java.puzzle.springbootvalidation.entity;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Data
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="name", nullable = false)
    @NotEmpty
    @Size(min = 2, message = "user name should have atleast 2 characters.")
    private String name;
    @Email
    @NotEmpty
    @Column(name = "email", nullable = false)
    private String email;
    @NotEmpty
    @Column(name="password", nullable = false)
    @Size(min = 5, max = 20, message = "Password should not be less than 5 and greater than 20.")
    private String password;
}