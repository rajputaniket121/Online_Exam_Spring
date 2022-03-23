package com.online_exam_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.online_exam_system.model.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
