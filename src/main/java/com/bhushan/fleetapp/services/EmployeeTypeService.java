package com.bhushan.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.fleetapp.models.EmployeeType;
import com.bhushan.fleetapp.repositories.EmployeeTypeRepository;

@Service
public class EmployeeTypeService {
	
	@Autowired
	private EmployeeTypeRepository repo;
	
	//Return list of employeeTypes
	public List<EmployeeType> getEmployeeTypes(){
		return repo.findAll();
	}
	
	//Save a new employeeType
	public void save(EmployeeType employeeType) {
		repo.save(employeeType);
	}
	
	//Get employeeType by ID
	public Optional<EmployeeType> findById(int  id) {
		return repo.findById(id);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
