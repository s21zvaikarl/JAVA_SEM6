package com.example.demo.repos;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Course;

public interface ICourseRepo extends CrudRepository<Course, Long>{
	ArrayList<Course> findByGradesStudentIds(long id);
	ArrayList<Course> findAllByProfessorsIdp(long id);
}
