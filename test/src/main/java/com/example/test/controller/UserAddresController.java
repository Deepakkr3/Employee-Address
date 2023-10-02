package com.example.test.controller;

import com.example.test.model.UserAddrs;
import com.example.test.service.UserAddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserAddresController {
    @Autowired
    private UserAddService userAddService;
    @PostMapping("addUser/address")
    public String addUser(@RequestBody List<UserAddrs> userAddrs){
        return userAddService.addUser(userAddrs);
    }
    @GetMapping("getUser/address")
    public List<UserAddrs> getUser(){
        return userAddService.getUser();
    }
}
