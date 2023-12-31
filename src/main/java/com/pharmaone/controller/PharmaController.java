package com.pharmaone.controller;

import com.pharmaone.model.UserAccess;
import com.pharmaone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/pharma")
public class PharmaController {
       @Autowired
       private UserService service;
       @GetMapping("/hello")
       public String show() {
              return "It Works!!!";
              }
       @GetMapping("/allusers")
       public List<UserAccess> getAll() {return service.getUsers();}

       @GetMapping("/1")
       public UserAccess getSpecificUser() {return service.getSpecificUser(1);}

}
