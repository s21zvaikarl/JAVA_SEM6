package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Student;

public interface IStudentRepo extends CrudRepository<Student, Long> {

}
