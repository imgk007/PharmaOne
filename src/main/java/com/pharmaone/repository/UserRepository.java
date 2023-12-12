package com.pharmaone.repository;

import org.apache.catalina.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<User> userList;

    public List<User> getUsers() {
        System.out.println(userList);
        return userList;
    }

    public User getSpecificUser(int userId) {
       return new User("tmp","tmp","customer");
    }
    public void addUser(User user) {
        userList.add(user);
    }

    public String validateUser(String userName, String password) {
        return "Valid";
    }
}
