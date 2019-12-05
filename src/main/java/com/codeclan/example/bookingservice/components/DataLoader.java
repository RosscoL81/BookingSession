package com.codeclan.example.bookingservice.components;

import com.codeclan.example.bookingservice.models.Booking;
import com.codeclan.example.bookingservice.models.Course;
import com.codeclan.example.bookingservice.models.Customer;
import com.codeclan.example.bookingservice.repositories.bookingRepository.BookingRepository;
import com.codeclan.example.bookingservice.repositories.courseRepository.CourseRepository;
import com.codeclan.example.bookingservice.repositories.customerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;



@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){}

    public void run(ApplicationArguments args){

        Customer emily = new Customer("Emily", "Dalkeith", 35);
        customerRepository.save(emily);

        Customer harrison = new Customer("Harrison", "Inverurie", 21);
        customerRepository.save(harrison);

        Course silent = new Course("Dealing with Silent Cohorts", "Edinburgh", 3);
        courseRepository.save(silent);

        Course nicknames = new Course("Creating nicknames for instructors", "Inverness", 4);
        courseRepository.save(nicknames);

        Booking booking1 = new Booking("02-12-19", silent, emily);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("05-12-19", nicknames, emily);
        bookingRepository.save(booking2);

        Booking booking3 = new Booking("04-12-19", nicknames, harrison);
        bookingRepository.save(booking3);
    }

}
