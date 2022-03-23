package com.online_exam_system.service;

import com.online_exam_system.model.Course;
import java.util.Set;

public interface CourseService {
	public Course addCourse(Course course);
	public Course updateCourse(Course course);
	public Set<Course> getCourses();
	public Course getCourse(long courseid);
	public void deleteCourse(long courseid); 

}
