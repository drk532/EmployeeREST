package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<EmployeeRest, Integer> {
  
    List<Employee> findAllByOrderByempSalaryAsc();

}
