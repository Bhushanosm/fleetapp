package com.bhushan.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.fleetapp.models.Vehicle;
import com.bhushan.fleetapp.repositories.VehicleRepository;

@Service
public class VehicleService {
	
	@Autowired
	private VehicleRepository repo;
	
	//Return list of vehicles
	public List<Vehicle> getVehicles(){
		return repo.findAll();
	}
	
	//Save a new vehicle
	public void save(Vehicle vehicle) {
		repo.save(vehicle);
	}
	
	//Get vehicle by ID
	public Optional<Vehicle> findById(int  id) {
		return repo.findById(id);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
