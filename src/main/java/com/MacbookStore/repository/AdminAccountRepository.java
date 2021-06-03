package com.MacbookStore.repository;


import com.MacbookStore.ViewModel.AdminViewModel;
import com.MacbookStore.model.AdminAccount;
import com.MacbookStore.model.Customer;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Repository
public interface AdminAccountRepository extends MongoRepository<AdminAccount, String> {
    AdminAccount findByUsername(String username);
    AdminAccount findByPassword(String password);
}

