package com.learningspringboot.__SpringBootRealTimeSearchRestAPIs.service;

import com.learningspringboot.__SpringBootRealTimeSearchRestAPIs.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> searchProducts(String query);

    Product createProduct(Product product);
}
