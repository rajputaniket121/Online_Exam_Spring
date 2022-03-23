package com.online_exam_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.online_exam_system.model.Course;
import com.online_exam_system.service.CourseService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class CourseController {
	@Autowired
	private CourseService courseService;
	
	//Add Course
	@PostMapping("/course")
	public ResponseEntity<Course> addCourse(@RequestBody Course course)
	{
		Course course2 = this.courseService.addCourse(course);
		return ResponseEntity.ok(course2);
	}
	
	//Get Course
	@GetMapping("/course/{courseId}")
	public Course getCourse(@PathVariable("courseId") Long courseid)
	{
		return this.courseService.getCourse(courseid);
	}
	
	//Get All Course
	@GetMapping("/course")
	public ResponseEntity<Set<Course>> getCourses()
	{
		return ResponseEntity.ok(this.courseService.getCourses());
	}
	
	//Update Course
	@PutMapping("/course")
	public ResponseEntity<Course> updateCourse(@RequestBody Course course)
	{
		return ResponseEntity.ok(this.courseService.updateCourse(course));
	}
	
	//Delete Course
	@DeleteMapping("/course/{courseId}")
	public void deleteCourse(@PathVariable("courseId") Long courseId)
	{
		this.courseService.deleteCourse(courseId);
	}

}
