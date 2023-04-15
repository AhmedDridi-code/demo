package com.example.demo.services;

import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepo;


    public User createUser(User user){
        return this.userRepo.save(user);
    }
    public List<User> listUsers(){
      return this.userRepo.findAll();
    }

}
