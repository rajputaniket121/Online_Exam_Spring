package com.online_exam_system.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserTable")
public class UserModel {
	@Id
	@Column(name = "id")
	@GeneratedValue
	private Long id;
	@Column(name = "Fullname")
	private String fullname;
	@Column(name = "Username")
	private String username;
	@Column(name = "Password")
	private String password;
	@Column(name = "Mobileno")
	private String mobileno;
	@Column(name = "City")
	private String city;
	@Column(name = "DOB")
	private String dob;
	@Column(name = "State")
	private String state;
	@Column(name = "Qualification")
	private String qualification;
	@Column(name = "YearOFCompletion")
	private String year;
	
	
	
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserModel( String fullname, String username, String password, String mobileno, String dob, String city,
			 String state, String qualification, String year) {
		super();
		this.fullname = fullname;
		this.username = username;
		this.password = password;
		this.mobileno = mobileno;
		this.dob = dob;
		this.city = city;		
		this.state = state;
		this.qualification = qualification;
		this.year = year;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", fullname=" + fullname + ", username=" + username + ", password=" + password
				+ ", mobileno=" + mobileno + ", city=" + city + ", dob=" + dob + ", state=" + state + ", qualification="
				+ qualification + ", year=" + year + "]";
	}
	

}