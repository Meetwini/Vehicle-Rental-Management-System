package com.rental;

import java.util.List;

public class RentalAgency {
    private List<Vehicle> vehicles;

    public RentalAgency(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void rentVehicle(Vehicle vehicle, Customer customer, int days) {
        if (vehicle.isAvailableForRental()) {
            vehicle.rent(customer, days);
            System.out.println("Rental Cost: " + vehicle.calculateRentalCost(days));
        } else {
            System.out.println("Vehicle not available.");
        }
    }
}
