package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.models.Course;
import com.example.demo.models.Degree;
import com.example.demo.models.Grade;
import com.example.demo.models.Professor;
import com.example.demo.models.Student;
import com.example.demo.repos.ICourseRepo;
import com.example.demo.repos.IGradeRepo;
import com.example.demo.repos.IProfessorRepo;
import com.example.demo.repos.IStudentRepo;

@SpringBootApplication
public class JavaSem6Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaSem6Application.class, args);
	}
	
	@Bean
	public CommandLineRunner testModel(IProfessorRepo prRepo, IStudentRepo stRepo, ICourseRepo coRepo, IGradeRepo grRepo) {
		
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				Professor p1 = new Professor("Juris", "Zagars", Degree.phd);				
				Professor p2 = new Professor("Dmitrijs", "Smirnovs", Degree.phd);
				prRepo.save(p1);
				prRepo.save(p2);
				
				Student s1 = new Student("Janis", "Berzins");
				Student s2 = new Student("Liga", "Alksnite");
				stRepo.save(s1);
				stRepo.save(s2);
				
				Course c1 = new Course("Haosa teorija", 4, p1);
				Course c2 = new Course("Ekonomikas pamati", 2, p2);
				coRepo.save(c1);
				coRepo.save(c2);
				
				grRepo.save(new Grade(5, s1, c1));
				grRepo.save(new Grade(10, s1, c2));
				grRepo.save(new Grade(8, s2, c1));
				grRepo.save(new Grade(4, s2, c2));
			}
		};
	}

}
