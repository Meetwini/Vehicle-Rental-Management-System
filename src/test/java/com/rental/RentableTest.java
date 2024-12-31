package com.rental;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RentableTest {

    @Test
    void testRentVehicle() {
        Customer customer = new Customer("John Doe", "john.doe@example.com");
        Vehicle car = new Car("C001", "Toyota Camry", 50);
        car.rent(customer, 5);
        assertEquals(customer.getCurrentRental(), car);
    }

    @Test
    void testReturnVehicle() {
        Customer customer = new Customer("John Doe", "john.doe@example.com");
        Vehicle car = new Car("C001", "Toyota Camry", 50);
        car.rent(customer, 5);
        car.returnVehicle();
        assertNull(customer.getCurrentRental());
    }
}
