package com.example.orderprocessingsystem.acknowledgement.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


@Setter
public class OrderDetails implements Serializable {
    private Long orderId;
    private String customerName;
    @Email(message = "Should be in email format")
    @NotNull(message = "Email should not be null")
    private String email;
    private String shippingAddress;
    private List<OrderItem> orderItems;
    private Integer totalAmount;
    private LocalDate orderDate;
    private OrderStatus status;

    @Override
    public String toString() {
        return "OrderDetails{" + "orderId=" + orderId + ", customerName='" + customerName + '\'' + ", email='" + email + '\'' + ", shippingAddress='" + shippingAddress + '\'' + ", orderItems=" + orderItems + ", totalAmount=" + totalAmount + ", orderDate=" + orderDate + ", status=" + status + '}';
    }
}
