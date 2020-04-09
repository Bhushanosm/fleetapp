package com.bhushan.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.fleetapp.models.Country;
import com.bhushan.fleetapp.repositories.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository repo;
	
	//Return list of countries
	public List<Country> getCountries(){
		return repo.findAll();
	}
	
	//Save a new country
	public void save(Country country) {
		repo.save(country);
	}
	
	//Get country by ID
	public Optional<Country> findById(int  id) {
		return repo.findById(id);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
