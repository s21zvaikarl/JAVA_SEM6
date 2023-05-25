package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.services.IFilteringServices;

@Controller
public class FilterController {

	@Autowired
	private IFilteringServices filterService;
	
	@GetMapping("/info/showAllStudents")//localhost:8080/info/showAllStudents
	public String getAllStudentsFunc(Model model) {
		model.addAttribute("students", filterService.retrieveAllStudents());
		return "all-students-page";//will show all-students-page.html
	}
	
	@GetMapping("/info/showAllProfessors")//localhost:8080/info/showAllStudents
	public String getAllProfessorsFunc(Model model) {
		model.addAttribute("professors", filterService.retrieveAllProfessors());
		return "all-professors-page";//will show all-students-page.html
	}
	
	@GetMapping("/info/showAllGrades")
	public String getAllGradesFunc(Model model) {
		model.addAttribute("grades", filterService.retrieveAllGrades());
		return "all-grades-page";
	}
	
}
