package com.example.academy.model;

import javax.validation.constraints.NotNull;

public class CourseModel {

	private Long courseId;
	@NotNull(message = "Name cannot be null")
	private String courseName;
	private Integer courseDuration;
	private String courseStartDate;
	private Long courseFees;

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Integer getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(Integer courseDuration) {
		this.courseDuration = courseDuration;
	}

	public String getCourseStartDate() {
		return courseStartDate;
	}

	public void setCourseStartDate(String courseStartDate) {
		this.courseStartDate = courseStartDate;
	}

	public Long getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(Long courseFees) {
		this.courseFees = courseFees;
	}

	@Override
	public String toString() {
		return "CourseModel [courseId=" + courseId + ", courseName=" + courseName + ", courseDuration=" + courseDuration
				+ ", courseStartDate=" + courseStartDate + ", courseFees=" + courseFees + "]";
	}

}
