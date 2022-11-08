package com.PizzaAPI.PizzaAPI.service;

import com.PizzaAPI.PizzaAPI.models.Orders;
import com.PizzaAPI.PizzaAPI.repository.CustomerRepository;
import com.PizzaAPI.PizzaAPI.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private OrderRepository orderRepository;

    public ResponseEntity<Iterable<Orders>> getAllOrders(){
        Iterable<Orders> allOrders = orderRepository.findAll();

        return new ResponseEntity<>(orderRepository.findAll(), HttpStatus.OK);
    }

    public void createOrder(Orders order, Long customerId){
        customerRepository.findById(customerId).map(customer -> {
            order.setCustomer(customer);
            return orderRepository.save(order);});
    }
}
