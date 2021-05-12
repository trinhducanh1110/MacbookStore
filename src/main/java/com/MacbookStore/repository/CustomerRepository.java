package com.MacbookStore.repository;



import com.MacbookStore.ViewModel.CustomerViewModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Transactional
@Repository
public interface CustomerRepository extends MongoRepository<CustomerViewModel, String> {
    boolean findByUsername(String Username);
    boolean findByPassword(String Password);
}
