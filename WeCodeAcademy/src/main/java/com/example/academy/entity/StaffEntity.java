package com.example.academy.entity;

import java.util.List;

import com.example.academy.classss.StaffType;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Staff")
public class StaffEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private Long id;
	@Enumerated(EnumType.STRING)
	private StaffType staffType;
	private String name;
	private String description;
	private Long age;
	private String mobileNumber;
	private String address;
	private String course;
	@OneToMany(mappedBy = "staffEntity", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<SalaryEntity> salaryEntities;

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

	public List<SalaryEntity> getSalaryEntities() {
		return salaryEntities;
	}

	public void setSalaryEntities(List<SalaryEntity> salaryEntities) {
		this.salaryEntities = salaryEntities;
	}

	@Override
	public String toString() {
		return "StaffEntity [id=" + id + ", staffType=" + staffType + ", name=" + name + ", description=" + description
				+ ", age=" + age + ", mobileNumber=" + mobileNumber + ", address=" + address + ", course=" + course
				+ ", salaryEntities=" + salaryEntities + "]";
	}

}
