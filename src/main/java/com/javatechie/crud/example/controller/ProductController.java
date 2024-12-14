package com.javatechie.crud.example.controller;

import com.javatechie.crud.example.entity.Product;
import com.javatechie.crud.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/health")
    public String healthCheck() {
        return "Service is up and running!";

    }

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return service.getProducts();
    }
    @GetMapping("/products/search")
    public List<Product> searchProducts(@RequestParam String keyword) {
    return service.searchProductsByKeyword(keyword);
}

}