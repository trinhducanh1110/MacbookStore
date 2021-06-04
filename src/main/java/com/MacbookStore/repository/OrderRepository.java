package com.MacbookStore.repository;

import com.MacbookStore.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository
public interface OrderRepository extends MongoRepository<Order, String> {
    List<Order> findAllByCustomerId(String customerId);
    Order findDistinctFirstByOrderId();
}
