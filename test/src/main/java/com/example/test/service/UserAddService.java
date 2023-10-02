package com.example.test.service;

import com.example.test.model.UserAddrs;
import com.example.test.repo.UserAddRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserAddService {
    @Autowired
    UserAddRepo userAddRepo;

    public String addUser(List<UserAddrs> userAddrs) {
        userAddRepo.saveAll(userAddrs);
        return "success";
    }

    public List<UserAddrs> getUser() {
        return userAddRepo.findAll();
    }
}
