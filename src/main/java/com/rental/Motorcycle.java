package com.rental;

public class Motorcycle extends Vehicle {
    public Motorcycle(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        double discount = (days > 5) ? 0.05 : 0.0; // 5% discount for rentals longer than 5 days
        return getBaseRentalRate() * days * (1 - discount);
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void rent(Customer customer, int days) {
        System.out.println(customer.getName() + " rented a Motorcycle for " + days + " days.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Motorcycle returned.");
        }
}

