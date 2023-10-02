package com.example.test.controller;

import com.example.test.model.UserModel;
import com.example.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class UserContoller {
    @Autowired
    UserService userService;
    @PostMapping("/users")
    public String addUser(@RequestBody List<UserModel> mymodel){
      return  userService.addUser(mymodel);

    }
    @GetMapping("get/users")
    public List<UserModel> getUsers(){
        return userService.getUsers();
    }
}
