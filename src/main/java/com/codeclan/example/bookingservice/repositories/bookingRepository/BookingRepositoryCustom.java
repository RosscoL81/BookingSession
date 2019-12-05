package com.codeclan.example.bookingservice.repositories.bookingRepository;

import com.codeclan.example.bookingservice.models.Booking;
import com.codeclan.example.bookingservice.models.Customer;

import java.util.List;

public interface BookingRepositoryCustom {
    List<Booking> getAllBookingsForGivenDate(String date);
}
