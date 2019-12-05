package com.codeclan.example.bookingservice.repositories.courseRepository;

import com.codeclan.example.bookingservice.models.Course;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.Oneway;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

public class CourseRepositoryImpl implements CourseRepositoryCustom{

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Course> getAllCoursesWithGivenRating(int starRating) {

        List<Course> result = null;

        Session session = entityManager.unwrap(Session.class);
        try{
            Criteria cr = session.createCriteria(Course.class);
            cr.add(Restrictions.eq("starRating", starRating));
            result = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }

    @Transactional
    public List<Course> getAllCoursesWithGivenCustomer(Long customerId) {
        List<Course> result = null;

        Session session = entityManager.unwrap(Session.class);
        try{
            Criteria cr = session.createCriteria(Course.class);
            cr.createAlias("bookings", "booking");
            cr.add(Restrictions.eq("booking.customer.id", customerId));
            result = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();
        } finally {
            session.close();
        }
        return result;
    }

}
