package com.marvin.WebApp.service;

import com.marvin.WebApp.model.Product;
import com.marvin.WebApp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;
    public List<Product> getAllProducts() {
        return  productRepo.findAll() ;

    }
    public Product getProductById(Integer proID) {
        return productRepo.findById(proID)
                .orElseThrow(() ->  new ProductNotFoundException("Product not found with ID: " + proID));

    }

    public Product addProduct(Product product){
        return productRepo.save(product);
    }
    public  Product updateProduct(Product product){
        return productRepo.save(product);
    }
    public  Product deleteProductById(Integer proID){
        return productRepo.findById(proID).get();
    }
    public void deleteProductByCont(Product product){
          productRepo.delete(product);

    }
}
