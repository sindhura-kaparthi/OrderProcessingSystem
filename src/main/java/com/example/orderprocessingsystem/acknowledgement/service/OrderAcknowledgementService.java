package com.example.orderprocessingsystem.acknowledgement.service;

import com.example.orderprocessingsystem.acknowledgement.model.OrderDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class OrderAcknowledgementService {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${springjms.myQueue}")
    private String queue;

    public void send(OrderDetails orderDetails) {
        jmsTemplate.convertAndSend(queue, orderDetails);
    }
}
