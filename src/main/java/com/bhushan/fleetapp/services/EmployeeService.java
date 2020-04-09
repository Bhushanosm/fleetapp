package com.bhushan.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.fleetapp.models.Employee;
import com.bhushan.fleetapp.repositories.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repo;
	
	//Return list of employees
	public List<Employee> getEmployees(){
		return repo.findAll();
	}
	
	//Save a new employee
	public void save(Employee employee) {
		repo.save(employee);
	}
	
	//Get employee by ID
	public Optional<Employee> findById(int  id) {
		return repo.findById(id);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
