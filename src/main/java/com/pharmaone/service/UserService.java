package com.pharmaone.service;

import com.pharmaone.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public List<User> getUsers() {return repository.getUsers();}
    public User getSpecificUser(int userId) {return repository.getSpecificUser(userId);}
    public String validateUser(String userName,String password) {repository.validateUser(userName,password);}
    public void addUser(User user) {repository.addUser(user);}
}
