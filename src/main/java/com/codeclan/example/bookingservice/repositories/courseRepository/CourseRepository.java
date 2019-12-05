package com.codeclan.example.bookingservice.repositories.courseRepository;

import com.codeclan.example.bookingservice.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
}
