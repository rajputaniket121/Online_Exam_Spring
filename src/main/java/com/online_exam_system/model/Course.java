package com.online_exam_system.model;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long courseid;
	private String coursename;
	private int courselevel;
	
	@OneToMany(mappedBy = "course",cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Quiz> quizzes = new LinkedHashSet<>();
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String coursename, int courselevel) {
		super();
		this.coursename = coursename;
		this.courselevel = courselevel;
	}
	public long getCourseid() {
		return courseid;
	}
	public void setCourseid(long courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getCourselevel() {
		return courselevel;
	}
	public void setCourselevel(int courselevel) {
		this.courselevel = courselevel;
	}
	
	
	
}
