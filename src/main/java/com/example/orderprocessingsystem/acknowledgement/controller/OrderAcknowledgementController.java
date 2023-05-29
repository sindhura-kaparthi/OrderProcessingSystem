package com.example.orderprocessingsystem.acknowledgement.controller;

import com.example.orderprocessingsystem.acknowledgement.model.OrderDetails;
import com.example.orderprocessingsystem.acknowledgement.service.OrderAcknowledgementService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class OrderAcknowledgementController {

    @Autowired
    OrderAcknowledgementService orderAcknowledgementService;

    @PostMapping("/order")
    public ResponseEntity<Map<String, String>> sendOrderDetails(@Valid @RequestBody OrderDetails orderDetails) {
        orderAcknowledgementService.send(orderDetails);
        Map<String, String> response = new HashMap<>();
        response.put("message", "Order Details sent");
        return ResponseEntity.ok(response);
    }
}