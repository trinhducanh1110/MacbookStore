package com.MacbookStore.service;


import com.MacbookStore.repository.ProductRepository;
import com.MacbookStore.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    public void insertProduct(Product product) {
        productRepository.insert(product);
    }

    public void editProduct(Product product) { productRepository.save(product); }

    public void deleteProduct(Product product) { productRepository.delete(product); }

}