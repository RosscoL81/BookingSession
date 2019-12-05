package com.codeclan.example.bookingservice.repositories.courseRepository;

import com.codeclan.example.bookingservice.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {
    List<Course> getAllCoursesWithGivenRating(int starRating);
    List<Course> getAllCoursesWithGivenCustomer(Long customerId);
}
