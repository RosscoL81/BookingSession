package com.codeclan.example.bookingservice;

import com.codeclan.example.bookingservice.models.Course;
import com.codeclan.example.bookingservice.repositories.bookingRepository.BookingRepository;
import com.codeclan.example.bookingservice.repositories.courseRepository.CourseRepository;
import com.codeclan.example.bookingservice.repositories.customerRepository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.Column;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BookingserviceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Autowired
	BookingRepository bookingRepository;

	@Test
	public void canGetWithGivenStarRating(){
		List<Course> foundCourses = courseRepository.getAllCoursesWithGivenRating(3);
		assertEquals(1, foundCourses.size());
		assertEquals("Dealing with Silent Cohorts", foundCourses.get(0).getName());

	}

}
