package com.example.academy.model;

import javax.validation.constraints.NotNull;

import com.example.academy.classss.StaffType;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class StaffModel {

	private Long id;
	@Enumerated(EnumType.STRING)
	private StaffType staffType;
	@NotNull(message = "Name cannot be null")
	private String name;
	private String description;
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

	public StaffType getStaffType() {
		return staffType;
	}

	public void setStaffType(StaffType staffType) {
		this.staffType = staffType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
		return "StaffModel [id=" + id + ", staffType=" + staffType + ", name=" + name + ", description=" + description
				+ ", age=" + age + ", mobileNumber=" + mobileNumber + ", address=" + address + ", course=" + course
				+ "]";
	}

}
