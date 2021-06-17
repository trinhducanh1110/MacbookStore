package com.MacbookStore.service;

import com.MacbookStore.model.Cart;
import com.MacbookStore.repository.CartRepository;
import com.MacbookStore.repository.OrderDetailRepository;
import com.MacbookStore.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderDetailRepository orderDetailRepository;

    public List<Cart> findAllByCustomerId(String customerId){ return cartRepository.findAllByCustomerId(customerId); }

    public void deleteItemFromCart(String _id){ cartRepository.deleteById(_id); }

    public void deleteCartByUser(String customerId){
        cartRepository.deleteByCustomerId(customerId);
    }
    public Cart findFirstByCustomerIdAndProductId(String customerId, String productId){
        return cartRepository.findFirstByCustomerIdAndProductId(customerId,productId);
    }
    public void insert(Cart cart){ cartRepository.insert(cart); }
    public void save(Cart cart){ cartRepository.save(cart); }
}
