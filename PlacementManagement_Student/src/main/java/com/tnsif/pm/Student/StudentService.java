package com.tnsif.pm.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.transaction.Transactional;

@Service

public class StudentService {
	@Autowired
	private StudentRepository repo;
	
	
	public List<Student> listAll(){
		return repo.findAll();
	}
	
	
	public Student get(Long id) {
		return repo.findById(id).get();	
	}
	
	public Student create(Student student) {
		return repo.save(student);
	}
	
	
	public void save(Student student) {
		 repo.save(student);
	}
	
	@Transactional
	public void delete( Long id) {
		 //repo.deleteAll();
		 repo.deleteById( id);
	}
}
