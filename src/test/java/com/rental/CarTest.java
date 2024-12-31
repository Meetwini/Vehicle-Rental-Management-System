package com.rental;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void testCarSpecificFeatures() {
        Vehicle car = new Car("C001", "Toyota Camry", 50);
        assertTrue(car.hasAirConditioning());
        assertEquals("Automatic", car.getTransmissionType());
    }

    @Test
    void testCarAvailability() {
        Vehicle car = new Car("C001", "Toyota Camry", 50);
        car.setAvailable(false);
        assertFalse(car.isAvailableForRental());
    }
}
