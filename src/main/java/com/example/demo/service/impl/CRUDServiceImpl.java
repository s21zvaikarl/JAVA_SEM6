package com.example.demo.service.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demo.models.Course;
import com.example.demo.models.Grade;
import com.example.demo.models.Professor;
import com.example.demo.models.Student;
import com.example.demo.services.IFilteringServices;

import lv.venta.model.Product;

@Service
public class CRUDServiceImpl implements IFilteringServices {
	
	private Student 
	
	@Override
	public ArrayList<Student> retrieveAllStudents() {
		return (ArrayList<Student>) studentRepo.findAll();
	}

	@Override
	public ArrayList<Professor> retrieveAllProfessors() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Course> retrieveAllCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Grade> retrieveAllGrades() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void retrieveGradesByStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retrieveCoursesByStudent() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retrieveCoursesByProfessor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double calculateAVGGradeInCourse() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
