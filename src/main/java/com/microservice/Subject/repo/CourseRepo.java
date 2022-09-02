package com.microservice.Subject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.Subject.pojo.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course,Long >{

}
