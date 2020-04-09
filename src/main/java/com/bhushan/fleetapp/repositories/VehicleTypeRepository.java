package com.bhushan.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhushan.fleetapp.models.VehicleType;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleTypeRepository extends JpaRepository<VehicleType, Integer> {

}
