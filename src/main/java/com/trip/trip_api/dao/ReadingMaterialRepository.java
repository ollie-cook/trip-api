package com.trip.trip_api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trip.trip_api.entity.ReadingMaterial;

public interface ReadingMaterialRepository extends JpaRepository<ReadingMaterial, Integer> {

}