package com.example.demo.services;

import java.util.ArrayList;

import com.example.demo.models.Course;
import com.example.demo.models.Grade;
import com.example.demo.models.Professor;
import com.example.demo.models.Student;

public interface IFilteringServices {
	public ArrayList<Student> retrieveAllStudents();
	
	public ArrayList<Professor> retrieveAllProfessors();
	
	public ArrayList<Course> retrieveAllCourses();
	
	public ArrayList<Grade> retrieveAllGrades();
	
	public ArrayList<Grade> retrieveGradesByStudent(long id);
	
	public abstract void retrieveCoursesByStudent();
	
	public abstract void retrieveCoursesByProfessor();
	
	public abstract double calculateAVGGradeInCourse();
	
	
}
