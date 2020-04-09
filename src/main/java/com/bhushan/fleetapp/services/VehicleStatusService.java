package com.bhushan.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.fleetapp.models.VehicleStatus;
import com.bhushan.fleetapp.repositories.VehicleStatusRepository;

@Service
public class VehicleStatusService {
	
	@Autowired
	private VehicleStatusRepository repo;
	
	//Return list of vehicleStatus
	public List<VehicleStatus> getVehicleStatuss(){
		return repo.findAll();
	}
	
	//Save a new vehicleStatus
	public void save(VehicleStatus vehicleStatus) {
		repo.save(vehicleStatus);
	}
	
	//Get vehicleStatus by ID
	public Optional<VehicleStatus> findById(int  id) {
		return repo.findById(id);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
