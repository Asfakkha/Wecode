package com.example.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.academy.model.SalaryModel;
import com.example.academy.service.SalaryService;

@RestController
@RequestMapping("/api/v1/salary")
public class SalaryController {

	@Autowired
	private SalaryService salaryService;

	@PostMapping
	public ResponseEntity<SalaryModel> create(@RequestBody SalaryModel salaryModel) {
		return new ResponseEntity<SalaryModel>(salaryService.withrouterSalary(salaryModel), HttpStatus.OK);
	}
}
