package com.PizzaAPI.PizzaAPI.controller;

import com.PizzaAPI.PizzaAPI.models.Orders;
import com.PizzaAPI.PizzaAPI.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public ResponseEntity<Iterable<Orders>> getAllBooks(){
        return orderService.getAllOrders();
    }
    @PostMapping("/orders/{customerId}/orders")
    public void createOrder(@PathVariable(value = "customerId") Long customerId, @Valid @RequestBody Orders order){
        orderService.createOrder(order, customerId);
    }
}
