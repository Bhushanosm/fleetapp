package com.bhushan.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bhushan.fleetapp.models.Client;

import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
