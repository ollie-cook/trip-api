package com.trip.trip_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trip.trip_api.dao.ReadingMaterialRepository;
import com.trip.trip_api.entity.ReadingMaterial;


@Service
public class ReadingMaterialServiceImpl implements ReadingMaterialService {

  @Autowired
  private ReadingMaterialRepository readingMaterialRepository;

  @Override
    public List<ReadingMaterial> findAll() {
        List<ReadingMaterial> tripEpisodes = readingMaterialRepository.findAll();
        return tripEpisodes;
    }
}