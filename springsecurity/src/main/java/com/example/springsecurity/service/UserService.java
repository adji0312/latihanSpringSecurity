package com.example.springsecurity.service;

import com.example.springsecurity.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserService{


    User save(User user);

    List<User> findAll();

    User getUserByEmail(String email);
}
