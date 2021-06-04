package com.MacbookStore.service;

import com.MacbookStore.ViewModel.CustomerViewModel;
import com.MacbookStore.model.Customer;
import com.MacbookStore.model.Product;
import com.MacbookStore.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Transactional
@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer getCustomerByUsername(String username){
        return customerRepository.findByUsername(username);
    }
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
    public String getCustomerId(String username){
        Customer temp = customerRepository.findByUsername(username);
        return temp.get_id();
    }
    public void insertCustomer(CustomerViewModel customer) throws ParseException {
        Customer temp = new Customer();
        temp.setUsername(customer.getUsername());
        temp.setPassword(customer.getPassword());
        temp.setAddress(customer.getAddress());
        String tempDate = customer.getBirth();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date birth = format.parse(tempDate);

        temp.setBirth(birth);
        temp.setEmail(customer.getEmail());
        temp.setCustomerName(customer.getCustomerName());
        temp.setPhoneNumber(customer.getPhoneNumber());
        customerRepository.insert(temp);
    }

}
