package com.tnsif.pm.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@GetMapping("/students")
	public List<Student> list(){
		return service.listAll();
	}
	
	//retrive by id
	@GetMapping("/students/id")
	public ResponseEntity<Student> get(@PathVariable Long id){
		try {
			Student student=service.get(id);
			return new ResponseEntity<Student>(student,HttpStatus.OK);
		}
		catch(Exception e) {
			return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
		}
	}
	
	//create
	@PostMapping("/students")
	public Student add(@RequestBody Student student) {
        
		return service.create(student);
         }
	
	//update
	@PutMapping("/students/ {id}")
	public ResponseEntity<?>update(@RequestBody Student student,@PathVariable Long id ){
		Student existstudent = service.get(id);
		 if (existstudent != null) {
	            if (student.getFirstName() == null || student.getId() == null || student.getEmail() == null) {
	                return new ResponseEntity<>("Invalid request payload", HttpStatus.BAD_REQUEST);
	            }
	            service.save(student);
	            return new ResponseEntity<Student>(student, HttpStatus.OK);
	        } else {
	            return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	        }
		
	}
	
	//delete operation
	@DeleteMapping("/students/(id)")
	public void delete(@PathVariable Long id) {
		service.delete(id);
		
	}

	
}
