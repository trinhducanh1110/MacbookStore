package com.MacbookStore.service;


import com.MacbookStore.repository.ProductRepository;
import com.MacbookStore.model.Product;
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

    public void saveProduct(Product product) {
        productRepository.insert(product);
    }

    /*public List<Product> sortProductByCollectionID(int collectionID) {
        return productRepository.findByCollectionID(collectionID);
    }*/

}