package com.MacbookStore.repository;

import com.MacbookStore.model.Cart;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface CartRepository extends MongoRepository<Cart, String> {
    List<Cart> findAllByCustomerId(String customerId);
    void deleteByCustomerId(String customerId);
}
