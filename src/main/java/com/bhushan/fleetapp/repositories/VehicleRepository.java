package com.bhushan.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhushan.fleetapp.models.Vehicle;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Integer> {

}
