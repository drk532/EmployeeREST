package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class EmployeeRestAppApplication {

	@Autowired
	EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(EmployeeRestAppApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		employeeRepository.save(new Employee("ABC","Devops",3434323));
		employeeRepository.save(new Employee("XYZ","Security",4323234));
		employeeRepository.save(new Employee("UVW","Programming",3232311));
		employeeRepository.save(new Employee("GHI","Security",2211121));
		
	}

}
