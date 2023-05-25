package com.example.demo.repos;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Grade;

public interface IGradeRepo extends CrudRepository<Grade, Long>{
	ArrayList<Grade> findByStudentIds(long id);

	ArrayList<Grade> findByCourseIdc(long id);
}
