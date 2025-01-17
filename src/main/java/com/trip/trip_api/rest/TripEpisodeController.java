package com.trip.trip_api.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trip.trip_api.entity.TripEpisode;
import com.trip.trip_api.service.TripEpisodeService;

@RestController 
@RequestMapping("/api")
public class TripEpisodeController {

  private TripEpisodeService tripEpisodeService;

  public TripEpisodeController(TripEpisodeService tripEpisodeService) {
        this.tripEpisodeService = tripEpisodeService;
  }

  @GetMapping("/episodes")
  public List<TripEpisode> findAll() {
      List<TripEpisode> episodes = tripEpisodeService.findAll();
      return episodes;
  }

  @GetMapping("/episodes/{episodeId}")
  public TripEpisode getTripEpisode(@PathVariable int episodeId) {
      TripEpisode episode = tripEpisodeService.findById(episodeId);
      System.out.println(episode);
      return episode; 
  }

  @GetMapping("/hello")
  public String hello() {
    return "Hello World!";
  }
}