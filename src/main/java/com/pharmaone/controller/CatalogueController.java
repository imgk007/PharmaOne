package com.pharmaone.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogueController {
    @GetMapping("/hellocatalogue")
    public String testFun() {return "Welcome to Catalogue";}

}
