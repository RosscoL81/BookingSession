package com.codeclan.example.bookingservice;

import com.codeclan.example.bookingservice.models.Booking;
import com.codeclan.example.bookingservice.models.Course;
import com.codeclan.example.bookingservice.models.Customer;
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
	public void canGetCoursesWithGivenStarRating(){
		List<Course> foundCourses = courseRepository.getAllCoursesWithGivenRating(3);
		assertEquals(1, foundCourses.size());
		assertEquals("Dealing with Silent Cohorts", foundCourses.get(0).getName());

	}

	@Test
	public void canGetCustomersOnGivenCourse(){
		List<Customer> foundCustomers = customerRepository.getAllCustomersOnGivenCourse(2L);
		assertEquals(2, foundCustomers.size());
	}

	@Test
	public void canGetCoursesWithGivenCustomer(){
		List<Course> foundCourses = courseRepository.getAllCoursesWithGivenCustomer(1L);
		assertEquals(2, foundCourses.size());
	}

	@Test
	public void canGetBookingsWithGivenDate(){
		List<Booking> foundBookings = bookingRepository.getAllBookingsForGivenDate("05-12-19");
		assertEquals("Emily", foundBookings.get(0).getCustomer().getName());
	}

}
