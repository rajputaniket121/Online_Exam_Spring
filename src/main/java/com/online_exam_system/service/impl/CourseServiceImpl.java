package com.online_exam_system.service.impl;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.online_exam_system.model.Course;
import com.online_exam_system.repository.CourseRepository;
import com.online_exam_system.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	CourseRepository courseRepository;

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return this.courseRepository.save(course);
	}

	@Override
	public Course updateCourse(Course course) {
		// TODO Auto-generated method stub
		return this.courseRepository.save(course);
	}

	@Override
	public Set<Course> getCourses() {
		// TODO Auto-generated method stub
		return new LinkedHashSet<>(this.courseRepository.findAll());
	}

	@Override
	public Course getCourse(long courseid) {
		// TODO Auto-generated method stub
		return this.courseRepository.findById(courseid).get();
	}

	@Override
	public void deleteCourse(long courseid) {
		// TODO Auto-generated method stub
		Course course = new Course();
		course.setCourseid(courseid);
		this.courseRepository.delete(course);
		
	}

}
