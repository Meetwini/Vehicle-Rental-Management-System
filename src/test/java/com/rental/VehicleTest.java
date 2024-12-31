package com.rental;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testCarRentalCost() {
        Vehicle car = new Car("C001", "Toyota Camry", 50);
        assertEquals(150, car.calculateRentalCost(3));
    }

    @Test
    void testMotorcycleDiscount() {
        Vehicle bike = new Motorcycle("M001", "Yamaha R15", 30);
        assertEquals(171, bike.calculateRentalCost(6)); // 5% discount applied
    }

    @Test
    void testTruckAdditionalFee() {
        Vehicle truck = new Truck("T001", "Ford F150", 100);
        assertEquals(350, truck.calculateRentalCost(3)); // +50 flat fee
    }
}
