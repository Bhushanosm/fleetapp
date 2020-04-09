package com.bhushan.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.fleetapp.models.Invoice;
import com.bhushan.fleetapp.repositories.InvoiceRepository;

@Service
public class InvoiceService {
	
	@Autowired
	private InvoiceRepository repo;
	
	//Return list of countries
	public List<Invoice> getInvoices(){
		return repo.findAll();
	}
	
	//Save a new invoice
	public void save(Invoice invoice) {
		repo.save(invoice);
	}
	
	//Get invoice by ID
	public Optional<Invoice> findById(int  id) {
		return repo.findById(id);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
