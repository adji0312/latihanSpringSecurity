package com.example.springsecurity.controller;

import com.example.springsecurity.domain.Response;
import com.example.springsecurity.model.User;
import com.example.springsecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PreLoginController {

    @Autowired
    private UserService userService;

    @PostMapping(value="/registration")
    public ResponseEntity<Response> registration(@RequestBody User user){
        User dbUser = userService.save(user);
        if(dbUser != null){
            return new ResponseEntity<Response>(new Response("User is saves successfully"), HttpStatus.OK);
        }
        return null;
    }
}
