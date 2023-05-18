package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Grade;

public interface IGradeRepo extends CrudRepository<Grade, Long>{

}
