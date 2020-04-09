package com.bhushan.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.fleetapp.models.Client;
import com.bhushan.fleetapp.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repo;
	
	//Return list of clients
	public List<Client> getClients(){
		return repo.findAll();
	}
	
	//Save a new client
	public void save(Client client) {
		repo.save(client);
	}
	
	//Get client by ID
	public Optional<Client> findById(int  id) {
		return repo.findById(id);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
