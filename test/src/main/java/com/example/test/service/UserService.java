package com.example.test.service;

import com.example.test.model.UserModel;
import com.example.test.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;


    public String addUser(List<UserModel> mymodel) {
        userRepo.saveAll(mymodel);
        return "success";
    }

    public List<UserModel> getUsers() {
        return userRepo.findAll();
    }
}
