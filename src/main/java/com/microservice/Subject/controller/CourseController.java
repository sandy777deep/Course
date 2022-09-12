package com.microservice.Subject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.Subject.pojo.Course;
import com.microservice.Subject.service.ServiceImpl;
@RestController
@RequestMapping("/course")

public class CourseController {
	
	@Autowired
	private ServiceImpl serviceImpl;
	
	
	@Value("${my.greetings}")
	public String greeting;
	
	@PostMapping(value="/addCourse")
	private Course addCourse(@RequestBody Course course) {
		return serviceImpl.addCourse(course);
				
	}
	 
	@GetMapping(value="/getCourse/{id}")
	private Course getCourse(@PathVariable long id) {
		return serviceImpl.getCourse(id);
	}
	
	
	@GetMapping(value="/greeting")
	private String greeting() {
		return greeting;
	}
	

}
