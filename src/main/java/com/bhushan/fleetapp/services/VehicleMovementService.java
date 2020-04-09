package com.bhushan.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.fleetapp.models.VehicleMovement;
import com.bhushan.fleetapp.repositories.VehicleMovementRepository;

@Service
public class VehicleMovementService {
	
	@Autowired	private VehicleMovementRepository repo;
	
	//Return list of vehicleMovements
	public List<VehicleMovement> getVehicleMovements(){
		return repo.findAll();
	}
	
	//Save a new vehicleMovement
	public void save(VehicleMovement vehicleMovement) {
		repo.save(vehicleMovement);
	}
	
	//Get vehicleMovement by ID
	public Optional<VehicleMovement> findById(int  id) {
		return repo.findById(id);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
