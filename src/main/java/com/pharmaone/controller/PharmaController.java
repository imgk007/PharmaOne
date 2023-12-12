package com.pharmaone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PharmaController {
@GetMapping("/hello")
public String show() {
       return "It Works!!!";
       }
}
