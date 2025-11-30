package com.marvin.WebApp.controller;


import com.marvin.WebApp.model.Product;
import com.marvin.WebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<Product> getProduct(@PathVariable("proID") Integer proID){
        Product product = service.getProductById(proID);
        if(product == null){
            return ResponseEntity.notFound().build();

        }
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product){
        return service.addProduct(product);
    }
    @PutMapping("/product")
    public   Product updateProduct( @RequestBody Product product){
         return  service.updateProduct(product);
    }


    @DeleteMapping("/product")
    public void deleteProduct(@RequestBody Product product){
        service.deleteProductByCont(product);
    }
}
