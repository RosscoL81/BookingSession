package com.codeclan.example.bookingservice.controllers;

import com.codeclan.example.bookingservice.models.Customer;
import com.codeclan.example.bookingservice.repositories.bookingRepository.BookingRepository;
import com.codeclan.example.bookingservice.repositories.customerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/courseId/{courseId}")
    public List<Customer> getAllCustomersOnGivenCourse(@PathVariable Long courseId){
        return customerRepository.getAllCustomersOnGivenCourse(courseId);
    }

    @GetMapping(value = "/courseId/town/{courseId}/{town}")
    public List<Customer> getAllCustomersOnGivenCourseInGivenTown(@PathVariable Long courseId, @PathVariable String town){
        return customerRepository.getAllCustomersWithGivenTownOnGivenCourse(courseId, town);
    }

}
