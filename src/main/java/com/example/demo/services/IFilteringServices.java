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
	
	public ArrayList<Grade> retrieveGradesByStudentId(long id);
	
	public ArrayList<Student> retrieveCoursesByStudentId(long id);
	
	public ArrayList<Professor> retrieveCoursesByProfessorId(long id);
	
	public float calculateAVGGradeInCourseId(long id);
	
	
}
