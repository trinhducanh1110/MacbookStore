package com.MacbookStore.service;

import com.MacbookStore.model.OrderDetail;
import com.MacbookStore.repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class OrderDetailService {
    @Autowired
    private  OrderDetailRepository orderDetailRepository;

    public List<OrderDetail> getOrderDetailByOrderId(String orderId){
        return orderDetailRepository.findAllByOrderId(orderId);
    }
    public void insert(OrderDetail orderDetail){ orderDetailRepository.insert(orderDetail); }
}
