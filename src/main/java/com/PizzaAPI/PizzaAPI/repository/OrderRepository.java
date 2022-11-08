package com.PizzaAPI.PizzaAPI.repository;

import com.PizzaAPI.PizzaAPI.models.Orders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Long> {
}
