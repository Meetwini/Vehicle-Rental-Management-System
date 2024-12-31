package com.rental;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MotorcycleTest {

    @Test
    void testMotorcycleSpecificDiscount() {
        Vehicle bike = new Motorcycle("M001", "Yamaha R15", 30);
        assertEquals(171, bike.calculateRentalCost(6)); // 5% discount applied for rental over 5 days
    }

    @Test
    void testMotorcycleAvailability() {
        Vehicle bike = new Motorcycle("M001", "Yamaha R15", 30);
        bike.setAvailable(false);
        assertFalse(bike.isAvailableForRental());
    }
}
