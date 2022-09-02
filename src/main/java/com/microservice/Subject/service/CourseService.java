package com.microservice.Subject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.Subject.pojo.Course;
import com.microservice.Subject.repo.CourseRepo;
@Service
public class CourseService implements ServiceImpl {
	
	@Autowired
	private CourseRepo Courserepo;
	
	

	@Override
	public Course addCourse(Course course) {
	
		return Courserepo.save(course);
	}
	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(Long id) {
		// TODO Auto-generated method stub
		return Courserepo.getById(id);
	}
	
	
	

}
