package com.example.demo.models;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name = "grade_table")
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Grade {
	@Column(name = "Idg")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Setter(value = AccessLevel.NONE)
	private long idg;
	
	@Column(name = "GValue")
	@Min(0)
	@Max(10)
	private int gvalue;
	
	@ManyToOne
	@JoinColumn(name = "Idp")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "Idc")
	private Course course;

	public Grade(@Min(0) @Max(10) int gvalue, Student student, Course course) {
		super();
		this.gvalue = gvalue;
		this.student = student;
		this.course = course;
	}

	public float getGvalue() {
		// TODO Auto-generated method stub
		return gvalue;
	}
	
	
	
}
