package com.bhushan.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.fleetapp.models.Supplier;
import com.bhushan.fleetapp.repositories.SupplierRepository;

@Service
public class SupplierService {
	
	@Autowired
	private SupplierRepository repo;
	
	//Return list of suppliers
	public List<Supplier> getSuppliers(){
		return repo.findAll();
	}
	
	//Save a new supplier
	public void save(Supplier supplier) {
		repo.save(supplier);
	}
	
	//Get supplier by ID
	public Optional<Supplier> findById(int  id) {
		return repo.findById(id);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
