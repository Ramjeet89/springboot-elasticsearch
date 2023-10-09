package com.springboot.esasticsearch.controller;

import com.springboot.esasticsearch.entity.Product;
import com.springboot.esasticsearch.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public Iterable<Product> getAllProduct() {
        return productService.getProducts();
    }

    @PostMapping("/products")
    public Product insertProduct(@RequestBody Product product){
        return productService.insertProduct(product);
    }

}
