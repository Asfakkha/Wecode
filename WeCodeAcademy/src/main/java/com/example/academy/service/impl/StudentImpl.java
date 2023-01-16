package com.example.academy.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.academy.entity.StudentEntity;
import com.example.academy.model.StudentModel;
import com.example.academy.repository.StudentRepository;
import com.example.academy.service.StudentService;

@Service
public class StudentImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;

	@Override
	public StudentModel create(StudentModel studentModel) {
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setName(studentModel.getName());
		studentEntity.setFatherName(studentModel.getFatherName());
		studentEntity.setAge(studentModel.getAge());
		studentEntity.setMobileNumber(studentModel.getMobileNumber());
		studentEntity.setAddress(studentModel.getAddress());
		studentEntity.setCourse(studentModel.getCourse());
		studentRepository.save(studentEntity);
		studentModel.setId(studentEntity.getId());
		return studentModel;
	}

	@Override
	public List<StudentModel> get() {
		List<StudentEntity> students = studentRepository.findAll();
		List<StudentModel> studentsModels = new ArrayList<>();
		for (StudentEntity entity : students) {
			studentsModels.add(entityToModel(entity));
		}
		return studentsModels;
	}

	@Override
	public StudentModel getById(Long id) {
		Optional<StudentEntity> optional = studentRepository.findById(id);
		StudentEntity entity = optional.get();
		StudentModel model = null;
		if (optional.isPresent()) {
			model = new StudentModel();
			model.setId(id);
			model.setName(entity.getName());
			model.setAge(entity.getAge());
			model.setAddress(entity.getAddress());
			model.setFatherName(entity.getFatherName());
			model.setMobileNumber(entity.getMobileNumber());
			model.setCourse(entity.getCourse());
		} else {
			System.out.println("id is not mach");
		}
		return model;
	}

	@Override
	public void delete(Long id) {
		studentRepository.deleteById(id);
	}

	@Override
	public StudentModel update(StudentModel studentModel, Long id) {
		Optional<StudentEntity> optional = studentRepository.findById(id);
		if (optional.isPresent()) {
			StudentEntity studentEntity = optional.get();
			studentEntity.setId(id);
			studentEntity.setName(studentModel.getName());
			studentEntity.setAddress(studentModel.getAddress());
			studentEntity.setAge(studentModel.getAge());
			studentEntity.setMobileNumber(studentModel.getMobileNumber());
			studentEntity.setFatherName(studentModel.getFatherName());
			studentEntity.setCourse(studentModel.getCourse());
			studentRepository.save(studentEntity);
			System.out.println(studentEntity);
		} else {
			System.out.println("id is not persent");
		}
		return studentModel;
	}

	private StudentModel entityToModel(StudentEntity entity) {
		StudentModel studentModel = new StudentModel();
		studentModel.setAddress(entity.getAddress());
		studentModel.setFatherName(entity.getFatherName());
		studentModel.setCourse(entity.getCourse());
		studentModel.setAge(entity.getAge());
		studentModel.setMobileNumber(entity.getMobileNumber());
		studentModel.setName(entity.getName());
		studentModel.setId(entity.getId());
		return studentModel;
	}

}
