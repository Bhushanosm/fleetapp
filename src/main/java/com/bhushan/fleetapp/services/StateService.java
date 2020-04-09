package com.bhushan.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.fleetapp.models.State;
import com.bhushan.fleetapp.repositories.StateRepository;

@Service
public class StateService {
	
	@Autowired
	private StateRepository repo;
	
	//Return list of countries
	public List<State> getStates(){
		return repo.findAll();
	}
	
	//Save a new country
	public void save(State country) {
		repo.save(country);
	}
	
	//Get country by ID
	public Optional<State> findById(int  id) {
		return repo.findById(id);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
