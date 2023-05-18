package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.models.Professor;

public interface IProfessorRepo extends CrudRepository<Professor, Long>{

}
