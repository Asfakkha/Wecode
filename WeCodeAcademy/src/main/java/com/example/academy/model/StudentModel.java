package com.example.academy.model;

import javax.validation.constraints.NotNull;

public class StudentModel {

	private Long id;
	@NotNull(message = "Name cannot be null")
	private String name;
	private String fatherName;
	private Long age;
	private String mobileNumber;
	private String address;
	private String course;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", name=" + name + ", fatherName=" + fatherName + ", age=" + age
				+ ", mobileNumber=" + mobileNumber + ", address=" + address + ", course=" + course + "]";
	}

}
