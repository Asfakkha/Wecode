package com.example.academy.service;

import com.example.academy.model.CourseModel;

public interface CourseService {
	public CourseModel create(CourseModel courseModel);

	public CourseModel update(CourseModel courseModel, Long id);

	public void delete(Long id);
}
