package com.PizzaAPI.PizzaAPI.service;

import com.PizzaAPI.PizzaAPI.models.Customer;
import com.PizzaAPI.PizzaAPI.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public ResponseEntity<Iterable<Customer>> getAllCustomers(){
        Iterable<Customer> allCategories = customerRepository.findAll();

        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }

    public void createCategory(Customer customer){
        customerRepository.save(customer);
    }
}
