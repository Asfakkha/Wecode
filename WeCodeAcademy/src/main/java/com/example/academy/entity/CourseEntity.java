package com.example.academy.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Course")
public class CourseEntity {

	@Id
	private Long courseId;
	private String courseName;
	private Integer courseDuration;
	private Date courseStartDate;
	private Long courseFees;

	public CourseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CourseEntity(Long courseId, String courseName, Integer courseDuration, Date courseStartDate,
			Long courseFees) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDuration = courseDuration;
		this.courseStartDate = courseStartDate;
		this.courseFees = courseFees;
	}

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

	public Date getCourseStartDate() {
		return courseStartDate;
	}

	public void setCourseStartDate(Date courseStartDate) {
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
		return "CourseEntity [courseId=" + courseId + ", courseName=" + courseName + ", courseDuration="
				+ courseDuration + ", courseStartDate=" + courseStartDate + ", courseFees=" + courseFees + "]";
	}

}
