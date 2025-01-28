package com.beeamX3.studentApp.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "first_name")
	private String studentFirstName;
	@Column(name = "last_name")
	private String studentLastName;
	@Column(name = "email")
	private String studentEmail;
	
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getStudentFirstName() {
		return studentFirstName;
	}



	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}



	public String getStudentLastName() {
		return studentLastName;
	}



	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}



	public String getStudentEmail() {
		return studentEmail;
	}



	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}



	public Student(int id, String studentFirstName, String studentLastName, String studentEmail) {
		super();
		this.id = id;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentEmail = studentEmail;
	}
	


	public Student(String studentFirstName, String studentLastName, String studentEmail) {
		super();
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentEmail = studentEmail;
	}



	public Student() {
		super();
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", studentFirstName=" + studentFirstName + ", studentLastName=" + studentLastName
				+ ", studentEmail=" + studentEmail + "]";
	}
	
	
	
}
