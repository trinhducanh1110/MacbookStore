package com.MacbookStore.repository;


import com.MacbookStore.model.Customer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
    Customer findByUsername(String username);
    Customer findByPassword(String password);
}
