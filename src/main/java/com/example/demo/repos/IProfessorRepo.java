package com.example.demo.repos;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Course;
import com.example.demo.models.Professor;

public interface IProfessorRepo extends CrudRepository<Professor, Long>{



}
