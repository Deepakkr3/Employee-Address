package com.example.test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class UserAddrs {
    @Id
    private int id;
    private String addr;
    private String city;
    @OneToOne
    @JoinColumn(name="userModelId")
    UserModel userModel;


    public UserAddrs() {
    }

    public UserAddrs(int id, String addr, String city, UserModel userModel) {
        this.id = id;
        this.addr = addr;
        this.city = city;
        this.userModel = userModel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }
}
