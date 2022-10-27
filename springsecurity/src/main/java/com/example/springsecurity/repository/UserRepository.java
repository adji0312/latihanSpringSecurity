package com.example.springsecurity.repository;

import com.example.springsecurity.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

//    User save(User user);
    User findByEmailIgnoreCase(String username);
}
