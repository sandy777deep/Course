 package com.microservice.Subject.service;

import org.springframework.stereotype.Service;

import com.microservice.Subject.pojo.Course;
@Service
public interface ServiceImpl {

	public Course addCourse(Course course);
	
	public Course getCourse(Long id);
	
	
}
