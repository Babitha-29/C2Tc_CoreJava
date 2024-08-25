package com.tnsif.pm.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long>{
/*
	 * {
	"firstName":"Suba",
	"lastName":"S",
	"email":"suba@gmail.com",
	  "dateOfBirth":"2003-08-29",
	  "department" : "cse"
	} 

 */
	
}