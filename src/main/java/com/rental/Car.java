package com.rental;

public class Car extends Vehicle {
    public Car(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void rent(Customer customer, int days) {
        System.out.println(customer.getName() + " rented a Car for " + days + " days.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Car returned.");
        }
}
