package com.twu.refactoring;

import java.util.List;

public class Order {
    String name;
    String address;
    List<Item> li;

    public Order(String name, String address, List<Item> li) {
        this.name = name;
        this.address = address;
        this.li = li;
    }

    public String getCustomerName() {
        return name;
    }

    public String getCustomerAddress() {
        return address;
    }

    public List<Item> getItems() {
        return li;
    }
}
