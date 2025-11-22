package com.marvin.WebApp.controller;


import com.marvin.WebApp.model.Product;
import com.marvin.WebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String greeting(){
        return "Hello Marvin!";
    }
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return  service.getAllProducts();
    }
    @GetMapping("/product/{proID}")
    public Product getProduct(@PathVariable("proID") Integer proID){
        return service.getProductById(proID);
    }
}
