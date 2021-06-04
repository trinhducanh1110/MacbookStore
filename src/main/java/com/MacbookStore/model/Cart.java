package com.MacbookStore.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Cart")
public class Cart {
    private String _id;
    private int cartId;
    private String customerId;
    private String productId;
    private int price;
    private int quantity;
}
