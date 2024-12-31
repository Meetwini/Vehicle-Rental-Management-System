package com.rental;

import java.util.Date;

public class RentalTransaction {
    private Vehicle vehicle;
    private Customer customer;
    private Date rentalDate;
    private int rentalDays;

    public RentalTransaction(Vehicle vehicle, Customer customer, Date rentalDate, int rentalDays) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDate = rentalDate;
        this.rentalDays = rentalDays;
    }


}
