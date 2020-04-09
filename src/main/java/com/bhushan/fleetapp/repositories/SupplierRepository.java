package com.bhushan.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bhushan.fleetapp.models.Supplier;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
