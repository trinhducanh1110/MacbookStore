package com.MacbookStore.service;


import com.MacbookStore.repository.ProductRepository;
import com.MacbookStore.model.Product;
import com.MacbookStore.model.Year;
import com.MacbookStore.repository.YearRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private YearRepository yearRepository;

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    public Product get1Product(String productId) {
        return productRepository.findFirstById(productId);
    }

    public void insertProduct(Product product) {
        productRepository.insert(product);
    }

    public void deleteProduct(String productId) { productRepository.deleteById(productId); }

    public void updateProduct(Product product) { productRepository.save(product); }

    public List<Product> getMacBookProductByCategory(String status, String yearId, String groupId){
        return productRepository.findAllByStatusAndYearIDAndGroupID(status, yearId, groupId);
    }
    public List<Product> getAccessoriesByCategory(String groupId){
        return productRepository.findAllByGroupID( groupId);
    }

}