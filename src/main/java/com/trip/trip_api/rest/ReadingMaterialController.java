package com.trip.trip_api.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trip.trip_api.entity.ReadingMaterial;
import com.trip.trip_api.service.ReadingMaterialService;

@RestController 
@RequestMapping("/api")
public class ReadingMaterialController {

  private ReadingMaterialService readingMaterialService;

  public ReadingMaterialController(ReadingMaterialService readingMaterialService) {
        this.readingMaterialService = readingMaterialService;
  }

  @GetMapping("/reading")
  public List<ReadingMaterial> findAll() {
      List<ReadingMaterial> episodes = readingMaterialService.findAll();
      return episodes;
  }
}