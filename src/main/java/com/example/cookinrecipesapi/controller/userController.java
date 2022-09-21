package com.example.cookinrecipesapi.controller;

import com.example.cookinrecipesapi.entity.user;
import com.example.cookinrecipesapi.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class userController {

    @Autowired
    private userService service;

    @GetMapping(value ="/get/users")
    public List<user> findAllUsers(){
        return service.getUser();
    }

    @PostMapping(value = "/post/user")
    public String createUser(@RequestBody user user)
    {
        service.createUser(user);
        return "New User is Added";
    }

    @GetMapping(value = "/get/user/{id}")
    public user getUserById(@PathVariable int id)
    {
        return service.getUserById(id);
    }

}