package com.PizzaAPI.PizzaAPI.repository;

import com.PizzaAPI.PizzaAPI.models.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
