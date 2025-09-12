package com.gl.microservice.client;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	CourseRepo courseRepo;
	
	public void add(Course course) {
		courseRepo.save(course);
	}
	
	public List<Course> getAll(){
		return courseRepo.findAll();
	}
	
	public Course getById(int id) {
		Optional<Course> courseOpt=courseRepo.findById(id);
		if(courseOpt.get() != null) {
			return courseOpt.get();
		}
		return null;
	}
	
	public void update (Course course) {
		courseRepo.save(course);
	}
	
	public void delete(int id) {
		Course course= new Course();
		course.setId(id);
		courseRepo.delete(course);
	}

}