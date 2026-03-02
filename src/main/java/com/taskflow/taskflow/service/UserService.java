package com.taskflow.taskflow.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<String> getAllUsers() {
        return List.of("Rahul","sagar","sundar","rakesh");

    }

    public String getUserById(int id) {
        List<String> users = getAllUsers();

        if(id<0 || id>users.size())
        {
            return null;
        }
        return users.get(id);
    }
}
