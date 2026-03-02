package com.taskflow.taskflow.controller;

import com.taskflow.taskflow.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<String> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable int id){
        return userService.getUserById(id);

    }
}
