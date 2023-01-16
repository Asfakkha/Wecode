package com.example.academy.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.academy.entity.FeesEntity;
import com.example.academy.entity.StudentEntity;
import com.example.academy.model.FeesModel;
import com.example.academy.repository.FeesRepository;
import com.example.academy.repository.StudentRepository;
import com.example.academy.service.FeesService;

@Service
public class IFeesServiceImpl implements FeesService {

	@Autowired
	FeesRepository feesRepository;

	@Autowired
	StudentRepository studentRepository;

	@Override
	public FeesModel deposit(FeesModel feesModel) {
		Optional<StudentEntity> optional = studentRepository.findById(feesModel.getStudentId());
		if (optional.isPresent()) {
			StudentEntity entity = optional.get();
			FeesEntity feesEntity = new FeesEntity();
			feesEntity.setDate(feesModel.getDate());
			feesEntity.setFeesDeposit(feesModel.getFeesDeposit());
			feesEntity.setStudentEntity(entity);
			feesRepository.save(feesEntity);
		}
		return feesModel;
	}

}
