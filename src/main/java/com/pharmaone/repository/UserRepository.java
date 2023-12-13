package com.pharmaone.repository;


import com.pharmaone.model.UserAccess;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private List<UserAccess> userList;

    public List<UserAccess> getUsers() {
        System.out.println(userList);
        return userList;
    }

    public UserAccess getSpecificUser(int userId) {
       return new UserAccess("tmp","tmp","customer");
    }
    public void addUser(UserAccess user) {
        userList.add(user);
    }

    public String validateUser(String userName, String password) {
        return "Valid";
    }
}
