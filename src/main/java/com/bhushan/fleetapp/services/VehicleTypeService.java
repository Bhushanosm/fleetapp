package com.bhushan.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.fleetapp.models.VehicleType;
import com.bhushan.fleetapp.repositories.VehicleTypeRepository;

@Service
public class VehicleTypeService {
	
	@Autowired
	private VehicleTypeRepository repo;
	
	//Return list of vehicleTypes
	public List<VehicleType> getVehicleTypes(){
		return repo.findAll();
	}
	
	//Save a new vehicleType
	public void save(VehicleType vehicleType) {
		repo.save(vehicleType);
	}
	
	//Get vehicleType by ID
	public Optional<VehicleType> findById(int  id) {
		return repo.findById(id);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
