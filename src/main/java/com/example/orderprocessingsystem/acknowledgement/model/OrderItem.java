package com.example.orderprocessingsystem.acknowledgement.model;

import java.io.Serializable;

public class OrderItem implements Serializable {
    private Long productId;
    private String productName;
    private Integer unitPrice;
    private Integer quantity;
    private Integer subtotal;
}