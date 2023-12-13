package com.pharmaone.service;

import com.pharmaone.model.UserAccess;
import com.pharmaone.repository.UserRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository repository;

    public List<UserAccess> getUsers() {return repository.getUsers();}
    public UserAccess getSpecificUser(int userId) {return repository.getSpecificUser(userId);}
    public String validateUser(String userName,String password) {return repository.validateUser(userName,password);}
    public void addUser(UserAccess user) {repository.addUser(user);}
}
