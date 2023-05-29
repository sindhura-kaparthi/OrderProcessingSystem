package com.example.orderprocessingsystem.shipmenttracking;

import com.example.orderprocessingsystem.acknowledgement.model.OrderDetails;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ShipmentTrackingListener {
    @JmsListener(destination = "${springjms.myQueue}")
    public void receive(OrderDetails orderDetails) {
        System.out.println("Message Received---->" + orderDetails);
    }
}