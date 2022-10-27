package com.example.springsecurity.service;

import com.example.springsecurity.model.User;
import com.example.springsecurity.repository.UserRepository;
import com.example.springsecurity.util.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User save(User user) {
        String password = PasswordUtil.getPasswordHash(user.getPassword());
        user.setPassword(password);
        user.setCreatedDate(new Date());
        return userRepository.save(user);
    }

    @Override
    public List<User> findAll() {
        return (List<User>) userRepository.findAll();
    }

    @Override
    public User getUserByEmail(String email) {
        return userRepository.findByEmailIgnoreCase(email);
    }
}
