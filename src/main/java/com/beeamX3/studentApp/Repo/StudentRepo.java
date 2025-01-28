package com.beeamX3.studentApp.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beeamX3.studentApp.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Integer>{

}
