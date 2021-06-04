package com.MacbookStore.controller;

import com.MacbookStore.service.OrderDetailService;
import com.MacbookStore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private final OrderService orderService;
    @Autowired
    private final OrderDetailService orderDetailService;

    public CartController(){
        orderService = new OrderService();
        orderDetailService = new OrderDetailService();
    }
}
