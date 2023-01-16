package com.example.academy.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.academy.entity.SalaryEntity;
import com.example.academy.entity.StaffEntity;
import com.example.academy.model.SalaryModel;
import com.example.academy.repository.SalaryRepository;
import com.example.academy.repository.StaffRepository;
import com.example.academy.service.SalaryService;

@Service
public class ISalarySericeImpl implements SalaryService {

	@Autowired
	private SalaryRepository salaryRepository;

	@Autowired
	private StaffRepository staffRepository;

	@Override
	public SalaryModel withrouterSalary(SalaryModel salaryModel) {
		Optional<StaffEntity> optional = staffRepository.findById(salaryModel.getStaffId());
		if (optional.isPresent()) {
			StaffEntity staffEntity = optional.get();
			SalaryEntity salaryEntity = new SalaryEntity();
			salaryEntity.setDate(salaryModel.getDate());
			salaryEntity.setSalary(salaryModel.getSalary());
			salaryEntity.setStaffEntity(staffEntity);
			salaryRepository.save(salaryEntity);
		}
		return salaryModel;
	}

}
