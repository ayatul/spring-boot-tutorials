package com.example.easynotes.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.easynotes.model.User;
import com.example.easynotes.repository.UserRepository;

@RestController
@RequestMapping("/api")

public class UserController {
UserRepository usrrepo;
	
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return usrrepo.findAll();
    }
	
}
