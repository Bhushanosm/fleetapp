package com.bhushan.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhushan.fleetapp.models.VehicleStatus;
import org.springframework.stereotype.Repository;

@Repository
public interface VehicleStatusRepository extends JpaRepository<VehicleStatus, Integer> {

}
