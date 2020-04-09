package com.bhushan.fleetapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.bhushan.fleetapp.models.User;
import com.bhushan.fleetapp.repositories.UserRepository;

@Service
public class UserService {
	@Autowired UserRepository repo;
	@Autowired private BCryptPasswordEncoder encoder;
	
	public void save(User user) {
		
		user.setPassword(encoder.encode(user.getPassword()));
		
		repo.save(user);
	}
}
