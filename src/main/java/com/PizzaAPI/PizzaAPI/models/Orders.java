package com.PizzaAPI.PizzaAPI.models;

import javax.persistence.*;
import java.util.Arrays;
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String crust;
    private String[] toppings;
    private String Status;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Orders(){

    }

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", crust='" + crust + '\'' +
                ", toppings=" + Arrays.toString(toppings) +
                ", Status='" + Status + '\'' +
                ", customer=" + customer +
                '}';
    }
}
