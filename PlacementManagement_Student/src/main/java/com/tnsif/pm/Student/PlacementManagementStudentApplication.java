package com.tnsif.pm.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.tnsif.pm.Student")

public class PlacementManagementStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlacementManagementStudentApplication.class, args);
		
		
	}

}
