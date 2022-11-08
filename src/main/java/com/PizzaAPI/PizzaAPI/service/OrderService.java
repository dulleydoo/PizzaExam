package com.PizzaAPI.PizzaAPI.service;

import com.PizzaAPI.PizzaAPI.models.Orders;
import com.PizzaAPI.PizzaAPI.repository.CustomerRepository;
import com.PizzaAPI.PizzaAPI.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.Order;

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

    public void createOrder(Orders orders, Long customerId){
        customerRepository.findById(customerId).map(customer -> {
            orders.setCustomer(customer);
            return orderRepository.save(orders);});
    }
    public void updateOrder(Orders orders, Long customerId){
        customerRepository.findById(customerId).map(customer -> {
            orders.setCustomer(customer);
            return orderRepository.save(orders);});
    }
    public void deleteOrder(Long orderId){
        orderRepository.deleteById(orderId);
    }
}
