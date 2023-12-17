package com.pharmaone.service;

import com.pharmaone.model.UserAccess;
import com.pharmaone.repository.UserRepository;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    private List<UserAccess> userList= Arrays.asList(new UserAccess("admin","admin","admin"));

    public List<UserAccess> getUsers() {

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
