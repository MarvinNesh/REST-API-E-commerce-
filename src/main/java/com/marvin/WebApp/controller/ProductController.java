package com.marvin.WebApp.controller;


import com.marvin.WebApp.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @RequestMapping("/")
    public String greeting(){
        return "Hello Marvin!";
    }
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return  service.getallProducts;
    }
}
