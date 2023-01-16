package com.example.academy.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.academy.model.StaffModel;
import com.example.academy.response.Response;
import com.example.academy.service.StaffService;

@RestController
@RequestMapping("api/v1/staff")
public class StaffController {

	@Autowired
	private StaffService staffService;

	@PostMapping
	public ResponseEntity<StaffModel> create(@RequestBody StaffModel staffModel) {
		StaffModel Model = staffService.create(staffModel);
		return new ResponseEntity<StaffModel>(Model, HttpStatus.OK);
	}

	@GetMapping()
	public ResponseEntity<List<StaffModel>> get() {
		return new ResponseEntity<List<StaffModel>>(staffService.get(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Response> getStaffById(@PathVariable("id") Long id) {
		StaffModel staff = staffService.getById(id);
		Response response = null;
		if (staff != null) {
			response = new Response(new Date(), "Success", null, staff);
		} else {
			List<String> errorMessages = new ArrayList<>();
			errorMessages.add("Staff Not Found");
			response = new Response(new Date(), "NOt found", errorMessages, staff);
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<StaffModel> update(@PathVariable("id") Long id, @RequestBody StaffModel staffModel) {
		StaffModel model = staffService.update(staffModel, id);
		return new ResponseEntity<StaffModel>(model, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteStudent(@PathVariable("id") Long id) {
		staffService.delete(id);
		return new ResponseEntity<Object>(null, HttpStatus.OK);
	}
}
