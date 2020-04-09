package com.bhushan.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhushan.fleetapp.models.VehicleModel;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleModelRepository extends JpaRepository<VehicleModel, Integer> {

}
