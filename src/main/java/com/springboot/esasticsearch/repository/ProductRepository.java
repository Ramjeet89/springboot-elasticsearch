package com.springboot.esasticsearch.repository;

import com.springboot.esasticsearch.entity.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepository extends ElasticsearchRepository<Product, Integer> {

}
