package com.MacbookStore.service;

import com.MacbookStore.model.Order;
import com.MacbookStore.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> getOrderDetailByCustomerId(String customerId){
        return orderRepository.findAllByCustomerId(customerId);
    }

    public void insertOrder(Order order){ orderRepository.insert(order);
    }
}
