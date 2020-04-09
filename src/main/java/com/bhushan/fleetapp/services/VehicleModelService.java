package com.bhushan.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.fleetapp.models.VehicleModel;
import com.bhushan.fleetapp.repositories.VehicleModelRepository;

@Service
public class VehicleModelService {
	
	@Autowired
	private VehicleModelRepository repo;
	
	//Return list of vehicleModel
	public List<VehicleModel> getVehicleModels(){
		return repo.findAll();
	}
	
	//Save a new vehicleModel
	public void save(VehicleModel vehicleModel) {
		repo.save(vehicleModel);
	}
	
	//Get vehicleModel by ID
	public Optional<VehicleModel> findById(int  id) {
		return repo.findById(id);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}

}
