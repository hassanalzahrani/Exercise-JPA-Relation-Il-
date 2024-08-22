package com.example.demo5.Repositry;

import com.example.demo5.Modell.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Integer> {

    Course findCourseById(Integer id);



}
