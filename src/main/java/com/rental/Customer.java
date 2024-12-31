package com.rental;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<RentalTransaction> rentalHistory = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRentalTransaction(RentalTransaction transaction) {
        rentalHistory.add(transaction);
    }

    public String getName() {
        return name;
    }

    public List<RentalTransaction> getRentalHistory() {
        return rentalHistory;
    }
}
