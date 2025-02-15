package com.learningspringboot.__SpringBootRealTimeSearchRestAPIs.service.impl;

import com.learningspringboot.__SpringBootRealTimeSearchRestAPIs.entity.Product;
import com.learningspringboot.__SpringBootRealTimeSearchRestAPIs.repository.ProductRepository;
import com.learningspringboot.__SpringBootRealTimeSearchRestAPIs.service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    ProductRepository productRepository;
    ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }
    @Override
    public List<Product> searchProducts(String query) {
        return productRepository.searchProducts(query);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }


}
