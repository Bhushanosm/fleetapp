package com.bhushan.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.fleetapp.models.Location;
import com.bhushan.fleetapp.repositories.LocationRepository;

@Service
public class LocationService {
	
	@Autowired
	private LocationRepository repo;
	
	//Return list of locations
	public List<Location> getLocations(){
		return repo.findAll();
	}
	
	//Save a new location
	public void save(Location location) {
		repo.save(location);
	}
	
	//Get location by ID
	public Optional<Location> findById(int  id) {
		return repo.findById(id);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
