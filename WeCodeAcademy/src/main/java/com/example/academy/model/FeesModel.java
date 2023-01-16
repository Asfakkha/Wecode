package com.example.academy.model;

import java.util.Date;

public class FeesModel {
	private Long feesDeposit;
	private Date date;
	private Long studentId;

	public Long getFeesDeposit() {
		return feesDeposit;
	}

	public void setFeesDeposit(Long feesDeposit) {
		this.feesDeposit = feesDeposit;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "FeesModel [feesDeposit=" + feesDeposit + ", date=" + date + ", studentId=" + studentId + "]";
	}

}
