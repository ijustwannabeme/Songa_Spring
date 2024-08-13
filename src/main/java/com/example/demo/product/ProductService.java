package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public String findProduct(int id) {
        return productRepository.findProduct(id);
    }

    public void save(String productName) {
        productRepository.save(productName);
    }
}
