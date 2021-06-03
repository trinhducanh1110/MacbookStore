package com.MacbookStore.service;

import com.MacbookStore.ViewModel.AdminViewModel;
import com.MacbookStore.ViewModel.CustomerViewModel;
import com.MacbookStore.model.AdminAccount;
import com.MacbookStore.model.Customer;
import com.MacbookStore.repository.AdminAccountRepository;
import com.MacbookStore.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class AdminAccountService {
    @Autowired
    private AdminAccountRepository adminAccountRepository;

    public boolean checkAdminAccount(CustomerViewModel customer){
        boolean result = false;
        if(!findUsername(customer.getUsername()) && !findPassword(customer.getPassword())){
            result = true;
        }
        return result;
    }
    public boolean findUsername(String username){ return adminAccountRepository.findByUsername(username) == null;
    }
    public boolean findPassword(String password){
        return adminAccountRepository.findByPassword(password) == null;
    }
    public String getCustomerName(String username){
        AdminAccount temp = adminAccountRepository.findByUsername(username);
        return temp.getCustomerName();
    }

}
