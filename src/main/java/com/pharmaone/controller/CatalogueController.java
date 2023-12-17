package com.pharmaone.controller;

import com.pharmaone.model.Catalogue;
import com.pharmaone.service.CatalogueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("/catalogue")
public class CatalogueController {
    @Autowired
    private CatalogueService products;
    @GetMapping("/hellocatalogue")
    public String testFun() {return "Welcome to Catalogue";}

    @GetMapping("/viewproducts")
    public List<Catalogue> viewAllProducts() {return products.viewAllProducts();}
}
