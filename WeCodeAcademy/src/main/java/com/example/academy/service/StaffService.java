package com.example.academy.service;

import java.util.List;

import com.example.academy.model.StaffModel;

public interface StaffService {
	public StaffModel create(StaffModel staffModel);

	public List<StaffModel> get();

	public StaffModel getById(Long id);

	public void delete(Long id);

	public StaffModel update(StaffModel staffModel, Long id);
}
