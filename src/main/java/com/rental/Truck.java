package com.rental;

public class Truck extends Vehicle {
    public Truck(String vehicleId, String model, double baseRentalRate) {
        super(vehicleId, model, baseRentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getBaseRentalRate() * days + 50; 
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }


    @Override
    public void rent(Customer customer, int days) {
        System.out.println(customer.getName() + " rented a Truck for " + days + " days.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Truck returned.");
        }
}
