package com.pony.java_8.controller;

public class Order {
    private Long id;
    private String name;
    private Long customerId;
    public Order() {
    }

    public Order(Long id, String name, Long customerId) {
        this.id = id;
        this.name = name;
        this.customerId = customerId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", customerId=" + customerId +
                '}';
    }
}
