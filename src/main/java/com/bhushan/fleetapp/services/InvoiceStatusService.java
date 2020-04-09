package com.bhushan.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.fleetapp.models.InvoiceStatus;
import com.bhushan.fleetapp.repositories.InvoiceStatusRepository;

@Service
public class InvoiceStatusService {
	
	@Autowired
	private InvoiceStatusRepository repo;
	
	//Return list of invoiceStatuss
	public List<InvoiceStatus> getInvoiceStatuss(){
		return repo.findAll();
	}
	
	//Save a new invoiceStatus
	public void save(InvoiceStatus invoiceStatus) {
		repo.save(invoiceStatus);
	}
	
	//Get invoiceStatus by ID
	public Optional<InvoiceStatus> findById(int  id) {
		return repo.findById(id);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
