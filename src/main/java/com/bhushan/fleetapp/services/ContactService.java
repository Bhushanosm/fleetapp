package com.bhushan.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.fleetapp.models.Contact;
import com.bhushan.fleetapp.repositories.ContactRepository;

@Service
public class ContactService {
	
	@Autowired
	private ContactRepository repo;
	
	//Return list of contacts
	public List<Contact> getContacts(){
		return repo.findAll();
	}
	
	//Save a new contact
	public void save(Contact contact) {
		repo.save(contact);
	}
	
	//Get contact by ID
	public Optional<Contact> findById(int  id) {
		return repo.findById(id);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
