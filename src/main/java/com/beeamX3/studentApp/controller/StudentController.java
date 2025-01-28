package com.beeamX3.studentApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.beeamX3.studentApp.Repo.StudentRepo;
import com.beeamX3.studentApp.entity.Student;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class StudentController {

	
	private static StudentRepo studentRepo;
	
	@PostMapping("/students")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student) {
		return new ResponseEntity<>(studentRepo.save(student),HttpStatus.CREATED);
	}
	
	@GetMapping("students")
	public ResponseEntity<List<Student>> getStudents(){
		return new ResponseEntity<>(studentRepo.findAll(),HttpStatus.OK);
	}
	
	@GetMapping("students/{id}")
	public ResponseEntity<Student> getStudents(@PathVariable int id){
	   Optional<Student> student=studentRepo.findById(id);
	   if(student.isPresent()) {
		   return new ResponseEntity<>(student.get(),HttpStatus.OK);
	   }else {
		   return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	   }
	}
	
	@PutMapping("students/{id}")
	public ResponseEntity<Student> getStudents(@PathVariable int id,@RequestBody Student stu){
	   Optional<Student> student=studentRepo.findById(id);
	   if(student.isPresent()) {
		   student.get().setStudentEmail(stu.getStudentEmail());
		   student.get().setStudentFirstName(stu.getStudentFirstName());
		   student.get().setStudentLastName(stu.getStudentLastName());
		   return new ResponseEntity<>(student.get(),HttpStatus.OK);
	   }else {
		   return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	   }
	}
}
