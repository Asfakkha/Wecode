package com.example.academy.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.academy.entity.StaffEntity;
import com.example.academy.model.StaffModel;
import com.example.academy.repository.StaffRepository;
import com.example.academy.service.StaffService;

@Service
public class StaffServiceImpl implements StaffService {

	@Autowired
	private StaffRepository staffRepository;

	@Override
	public StaffModel create(StaffModel staffModel) {
		StaffEntity staffEntity = new StaffEntity();
		staffEntity.setStaffType(staffModel.getStaffType());
		staffEntity.setName(staffModel.getName());
		staffEntity.setDescription(staffModel.getDescription());
		staffEntity.setAge(staffModel.getAge());
		staffEntity.setMobileNumber(staffModel.getMobileNumber());
		staffEntity.setAddress(staffModel.getAddress());
		staffEntity.setCourse(staffModel.getCourse());
		staffRepository.save(staffEntity);
		staffModel.setId(staffEntity.getId());
		return staffModel;
	}

	@Override
	public List<StaffModel> get() {
		List<StaffEntity> staffEntities = staffRepository.findAll();
		List<StaffModel> staffModels = new ArrayList<>();
		for (StaffEntity entity : staffEntities) {
			staffModels.add(entityToModel(entity));
		}
		return staffModels;
	}

	@Override
	public StaffModel getById(Long id) {
		Optional<StaffEntity> optional = staffRepository.findById(id);
		StaffEntity entity = optional.get();
		StaffModel model = null;
		if (optional.isPresent()) {
			model = new StaffModel();
			model.setId(id);
			model.setStaffType(entity.getStaffType());
			model.setName(entity.getName());
			model.setAge(entity.getAge());
			model.setAddress(entity.getAddress());
			model.setDescription(entity.getDescription());
			model.setMobileNumber(entity.getMobileNumber());
			model.setCourse(entity.getCourse());
		} else {
			System.out.println("id is not mach");
		}
		return model;
	}

	@Override
	public void delete(Long id) {
		staffRepository.deleteById(id);
	}

	@Override
	public StaffModel update(StaffModel staffModel, Long id) {
		Optional<StaffEntity> optional = staffRepository.findById(id);
		if (optional.isPresent()) {
			StaffEntity staffEntity = optional.get();
			staffEntity.setId(id);
			staffEntity.setStaffType(staffModel.getStaffType());
			staffEntity.setName(staffModel.getName());
			staffEntity.setAddress(staffModel.getAddress());
			staffEntity.setAge(staffModel.getAge());
			staffEntity.setMobileNumber(staffModel.getMobileNumber());
			staffEntity.setDescription(staffModel.getDescription());
			staffEntity.setCourse(staffModel.getCourse());
			staffRepository.save(staffEntity);
			System.out.println(staffEntity);
		} else {
			System.out.println("id is not persent");
		}
		return staffModel;
	}

	private StaffModel entityToModel(StaffEntity staffEntity) {
		StaffModel staffModel = new StaffModel();
		staffModel.setStaffType(staffEntity.getStaffType());
		staffModel.setName(staffEntity.getName());
		staffModel.setDescription(staffEntity.getDescription());
		staffModel.setAge(staffEntity.getAge());
		staffModel.setMobileNumber(staffEntity.getMobileNumber());
		staffModel.setAddress(staffEntity.getAddress());
		staffModel.setCourse(staffEntity.getCourse());
		staffModel.setId(staffEntity.getId());
		return staffModel;
	}
}
