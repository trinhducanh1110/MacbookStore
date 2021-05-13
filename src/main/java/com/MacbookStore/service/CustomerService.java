package com.MacbookStore.service;

import com.MacbookStore.ViewModel.CustomerViewModel;
import com.MacbookStore.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;


    public boolean checkAccount(CustomerViewModel customer){
        boolean result = false;
        if(!findUsername(customer.getUsername()) && !findPassword(customer.getPassword())){
            result = true;
        }
        return result;
    }
    public boolean findUsername(String username){
        return customerRepository.findByUsername(username) == null;
    }
    public boolean findPassword(String password){
        return customerRepository.findByPassword(password) == null;
    }

}
