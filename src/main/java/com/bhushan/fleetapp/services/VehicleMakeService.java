package com.bhushan.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.fleetapp.models.VehicleMake;
import com.bhushan.fleetapp.repositories.VehicleMakeRepository;

@Service
public class VehicleMakeService {
	
	@Autowired
	private VehicleMakeRepository repo;
	
	//Return list of vehicleMakes
	public List<VehicleMake> getVehicleMakes(){
		return repo.findAll();
	}
	
	//Save a new vehicleMake
	public void save(VehicleMake vehicleMake) {
		repo.save(vehicleMake);
	}
	
	//Get vehicleMake by ID
	public Optional<VehicleMake> findById(int  id) {
		return repo.findById(id);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
