package com.example.academy.service;

import java.util.List;

import com.example.academy.model.StudentModel;

public interface StudentService {

	public StudentModel create(StudentModel studentModel);

	public List<StudentModel> get();

	public StudentModel getById(Long id);

	public void delete(Long id);

	public StudentModel update(StudentModel studentModel, Long id);
}
