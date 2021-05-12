package com.MacbookStore.service;

import com.MacbookStore.ViewModel.CustomerViewModel;
import com.MacbookStore.model.Customer;
import com.MacbookStore.repository.CustomerRepository;
import com.MacbookStore.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public boolean getUser(CustomerViewModel customer){
        boolean result = false;
        if(customerRepository.findByUsername(customer.getUsername())){
            if(customerRepository.findByPassword(customer.getPassword())){
                result = true;
            }
        }
        return result;
    }
}
