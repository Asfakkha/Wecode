package com.example.academy.classss;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.academy.entity.CourseEntity;
import com.example.academy.repository.CourseRepository;

@Component
public class CourseDetails implements CommandLineRunner {

	@Autowired
	CourseRepository courseRepository;

	@Override
	public void run(String... args) throws Exception {
		courseRepository.save(new CourseEntity(1l, "java", 12, new Date(2022 - 02 - 02), 3500l));
		courseRepository.save(new CourseEntity(1l, "javaScript", 6, new Date(2023 - 01 - 16), 3000l));
		courseRepository.save(new CourseEntity(1l, "PHP", 7, new Date(2022 - 8 - 02), 3000l));
		courseRepository.save(new CourseEntity(1l, "HTML", 8, new Date(2022 - 05 - 20), 3000l));
		courseRepository.save(new CourseEntity(1l, "Node", 6, new Date(2023 - 01 - 8), 3000l));
	}

}
