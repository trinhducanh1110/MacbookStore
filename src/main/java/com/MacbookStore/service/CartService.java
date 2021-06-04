package com.MacbookStore.service;

import com.MacbookStore.model.Cart;
import com.MacbookStore.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public List<Cart> findAllByCustomerId(String customerId){ return cartRepository.findAllByCustomerId(customerId); }

    public void deleteItemFromCart(String _id){ cartRepository.deleteById(_id); }
}
