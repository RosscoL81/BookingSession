package com.codeclan.example.bookingservice.controllers;

import com.codeclan.example.bookingservice.models.Course;
import com.codeclan.example.bookingservice.repositories.bookingRepository.BookingRepository;
import com.codeclan.example.bookingservice.repositories.courseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/starRating/{starRating}")
    public List<Course> getAllCoursesForGivenStarRating(@PathVariable int starRating){
        return courseRepository.getAllCoursesWithGivenRating(starRating);
    }

    @GetMapping(value = "/customerId/{customerId}")
    public List<Course> getAllCoursesWithGivenCustomer(@PathVariable Long customerId){
        return courseRepository.getAllCoursesWithGivenCustomer(customerId);
    }
}
