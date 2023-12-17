package com.pharmaone.service;

import com.pharmaone.model.Catalogue;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CatalogueService {

    public List<Catalogue> productList= Arrays.asList(new Catalogue(1,"Temp",1,"Medicine","12-09-2024"));
    public List<Catalogue> viewAllProducts() {
        return productList;
    }
}
