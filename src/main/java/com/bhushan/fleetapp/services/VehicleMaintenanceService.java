package com.bhushan.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.fleetapp.models.VehicleMaintenance;
import com.bhushan.fleetapp.repositories.VehicleMaintenanceRepository;

@Service
public class VehicleMaintenanceService {
	
	@Autowired
	private VehicleMaintenanceRepository repo;
	
	//Return list of vehicleMaintenances
	public List<VehicleMaintenance> getVehicleMaintenances(){
		return repo.findAll();
	}
	
	//Save a new vehicleMaintenance
	public void save(VehicleMaintenance vehicleMaintenance) {
		repo.save(vehicleMaintenance);
	}
	
	//Get vehicleMaintenance by ID
	public Optional<VehicleMaintenance> findById(int  id) {
		return repo.findById(id);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
