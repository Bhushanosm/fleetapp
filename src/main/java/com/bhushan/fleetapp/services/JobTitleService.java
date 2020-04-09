package com.bhushan.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.fleetapp.models.JobTitle;
import com.bhushan.fleetapp.repositories.JobTitleRepository;

@Service
public class JobTitleService {
	
	@Autowired
	private JobTitleRepository repo;
	
	//Return list of jobTitles
	public List<JobTitle> getJobTitles(){
		return repo.findAll();
	}
	
	//Save a new jobTitle
	public void save(JobTitle jobTitle) {
		repo.save(jobTitle);
	}
	
	//Get jobTitle by ID
	public Optional<JobTitle> findById(int  id) {
		return repo.findById(id);
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}
}
