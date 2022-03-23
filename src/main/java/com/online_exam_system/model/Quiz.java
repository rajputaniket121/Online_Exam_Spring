package com.online_exam_system.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Quiz {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long qId;
	private String title;
	private String description;
	private String maxMarks;
	private String numberOfQuestions;
	private byte active = 0;
	@ManyToOne(fetch = FetchType.EAGER)
	private Course course;
	@OneToMany(mappedBy = "quiz",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Question> questions= new HashSet<>();
	
	public Set<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(Set<Question> questions) {
		this.questions = questions;
	}
	public byte getActive() {
		return active;
	}
	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getqId() {
		return qId;
	}
	public void setqId(Long qId) {
		this.qId = qId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMaxMarks() {
		return maxMarks;
	}
	public void setMaxMarks(String maxMarks) {
		this.maxMarks = maxMarks;
	}
	public String getNumberOfQuestions() {
		return numberOfQuestions;
	}
	public void setNumberOfQuestions(String numberOfQuestions) {
		this.numberOfQuestions = numberOfQuestions;
	}
	public byte isActive() {
		return active;
	}
	public void setActive(byte active) {
		this.active = active;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}	

}
