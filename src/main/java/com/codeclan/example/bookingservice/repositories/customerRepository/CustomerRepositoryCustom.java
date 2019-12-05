package com.codeclan.example.bookingservice.repositories.customerRepository;

import com.codeclan.example.bookingservice.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> getAllCustomersOnGivenCourse(Long courseId);
}
