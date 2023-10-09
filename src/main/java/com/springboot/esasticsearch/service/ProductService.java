package com.springboot.esasticsearch.service;

import com.springboot.esasticsearch.entity.Product;
import com.springboot.esasticsearch.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {


    @Autowired
    private ProductRepository productRepository;


    public Iterable<Product> getProducts() {
        return productRepository.findAll();

    }

    public Product insertProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product, int id) {
        Product prod = productRepository.findById(id).get();
        prod.setPrice(product.getPrice());
        return prod;
    }

    public void deleteProduct(int id) {
        productRepository.deleteById(id);
    }
}
