package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Course;

public interface ICourseRepo extends CrudRepository<Course, Long>{

}
