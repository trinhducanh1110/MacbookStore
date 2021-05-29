package com.MacbookStore.repository;


import com.MacbookStore.model.HardDrive;
import com.MacbookStore.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Transactional
@Repository
public interface ProductRepository extends MongoRepository<Product, String> {
    Product findFirstById(String productID);
}
