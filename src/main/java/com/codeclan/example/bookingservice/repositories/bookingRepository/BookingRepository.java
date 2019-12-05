package com.codeclan.example.bookingservice.repositories.bookingRepository;

import com.codeclan.example.bookingservice.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
}
