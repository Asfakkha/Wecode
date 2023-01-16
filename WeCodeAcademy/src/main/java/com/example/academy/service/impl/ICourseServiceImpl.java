package com.example.academy.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.academy.entity.CourseEntity;
import com.example.academy.model.CourseModel;
import com.example.academy.repository.CourseRepository;
import com.example.academy.service.CourseService;

public class ICourseServiceImpl implements CourseService {

	@Autowired
	private CourseRepository courseRepository;

	@Override
	public CourseModel create(CourseModel courseModel) {
		CourseEntity entity = new CourseEntity();
		entity.setCourseDuration(courseModel.getCourseDuration());

		courseRepository.save(entity);

		return courseModel;
	}

	@Override
	public CourseModel update(CourseModel courseModel, Long id) {
		Optional<CourseEntity> optional = courseRepository.findById(id);
		if (optional.isPresent()) {
			CourseEntity courseEntity = optional.get();
			courseEntity.setCourseDuration(courseModel.getCourseDuration());
		}
		return courseModel;
	}

	@Override
	public void delete(Long id) {
		courseRepository.deleteById(id);
	}

}
