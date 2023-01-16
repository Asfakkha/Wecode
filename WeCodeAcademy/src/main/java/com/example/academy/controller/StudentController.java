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

import com.example.academy.model.StudentModel;
import com.example.academy.response.Response;
import com.example.academy.service.StudentService;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@PostMapping()
	public ResponseEntity<StudentModel> create(@RequestBody StudentModel studentModel) {
		return new ResponseEntity<StudentModel>(studentService.create(studentModel), HttpStatus.OK);
	}

	@GetMapping()
	public ResponseEntity<List<StudentModel>> getStudents() {
		return new ResponseEntity<List<StudentModel>>(studentService.get(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Response> getStudentById(@PathVariable("id") Long id) {
		StudentModel student = studentService.getById(id);
		Response response = null;
		if (student != null) {
			response = new Response(new Date(), "Success", null, student);
		} else {
			List<String> errorMessages = new ArrayList<>();
			errorMessages.add("Studen Not Found");
			response = new Response(new Date(), "NOt found", errorMessages, student);
		}
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<StudentModel> updateStudent(@PathVariable("id") Long id,
			@RequestBody StudentModel studentModel) {
		StudentModel model = studentService.update(studentModel, id);
		return new ResponseEntity<StudentModel>(model, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteStudent(@PathVariable("id") Long id) {
		studentService.delete(id);
		return new ResponseEntity<Object>(null, HttpStatus.OK);
	}
}
