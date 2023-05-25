package com.example.demo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Course;
import com.example.demo.models.Grade;
import com.example.demo.models.Professor;
import com.example.demo.models.Student;
import com.example.demo.repos.ICourseRepo;
import com.example.demo.repos.IGradeRepo;
import com.example.demo.repos.IProfessorRepo;
import com.example.demo.repos.IStudentRepo;

@Service
public class FilteringServiceImpl implements IFilteringServices {
	
	@Autowired
	private IProfessorRepo profRepo;
	
	@Autowired
	private IStudentRepo studRepo;
	
	@Autowired
	private ICourseRepo courseRepo;
	
	@Autowired
	private IGradeRepo gradeRepo;
	
	@Override
	public ArrayList<Student> retrieveAllStudents() {
		return (ArrayList<Student>) studRepo.findAll();
	}

	@Override
	public ArrayList<Professor> retrieveAllProfessors() {
		return (ArrayList<Professor>) profRepo.findAll();
	}

	@Override
	public ArrayList<Course> retrieveAllCourses() {
		return (ArrayList<Course>) courseRepo.findAll();
	}

	@Override
	public ArrayList<Grade> retrieveAllGrades() {
		return (ArrayList<Grade>) gradeRepo.findAll();
	}
	
	@Override
	public ArrayList<Grade> retrieveGradesByStudentId(long id) throws Exception {
		if(id > 0) {
			ArrayList<Grade> filteredResults = gradeRepo.findByStudentIds(id);
			return filteredResults;
		}
		else throw new Exception("Wrong ID");
	}

	@Override
	public ArrayList<Course> retrieveCoursesByStudentId(long id) throws Exception {
		if(id > 0) {
			ArrayList<Course> filteredResults = courseRepo.findByGradesStudentIds(id);
			return filteredResults;
		}
		else throw new Exception("Wrong ID");
	}

	@Override
	public ArrayList<Course> retrieveCoursesByProfessorId(long id)  throws Exception{
		if(id > 0) {
			ArrayList<Course> filteredResults = courseRepo.findAllByProfessorsIdp(id);
			return filteredResults;
		}
		else
		{
			throw new Exception("Incorrect ID");
		}
	}

	@Override
	public float calculateAVGGradeInCourseId(long id) throws Exception {
		if(id > 0) {
			ArrayList<Grade> filteredResults = gradeRepo.findByCourseIdc(id);
			float gradeSum = 0;
			for(Grade temp: filteredResults) {
				gradeSum += temp.getGvalue();
			}
			return gradeSum/filteredResults.size();
		}
		else throw new Exception("Wrong ID");
	}

	
}
