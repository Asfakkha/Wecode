package com.example.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.academy.model.FeesModel;
import com.example.academy.service.FeesService;

@RestController
@RequestMapping("api/v1/fees")
public class FeesController {

	@Autowired
	private FeesService service;

	@PostMapping
	public ResponseEntity<FeesModel> create(@RequestBody FeesModel feesModel) {
		return new ResponseEntity<FeesModel>(service.deposit(feesModel), HttpStatus.OK);
	}
}
