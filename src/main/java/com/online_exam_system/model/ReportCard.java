package com.online_exam_system.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ReportCard")
public class ReportCard {
	
	@Id
	private String reportId;
	private String userId;
	private String courseId;
	private int marks;
	private String remarks;
	public String getReportId() {
		return reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public ReportCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ReportCard(String reportId, String userId, String courseId, int marks, String remarks) {
		super();
		this.reportId = reportId;
		this.userId = userId;
		this.courseId = courseId;
		this.marks = marks;
		this.remarks = remarks;
	}
	@Override
	public String toString() {
		return "ReportCard [reportId=" + reportId + ", userId=" + userId + ", courseId=" + courseId + ", marks=" + marks
				+ ", remarks=" + remarks + "]";
	}
	
	

}
