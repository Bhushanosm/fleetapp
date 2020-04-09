package com.bhushan.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.fleetapp.models.VehicleHire;
import com.bhushan.fleetapp.repositories.VehicleHireRepository;

@Service
public class VehicleHireService {
	
	@Autowired
	private VehicleHireRepository repo;
	
	//Return list of vehicleHire
	public List<VehicleHire> getVehicleHires(){
		return repo.findAll();
	}
	
	//Save a new vehicleHire
	public void save(VehicleHire vehicleHire) {
		repo.save(vehicleHire);
	}
	
	//Get vehicleHire by ID
	public Optional<VehicleHire> findById(int  id) {
		return repo.findById(id);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
