package com.trip.trip_api.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

  @GetMapping("/episodes/{episodeId}")
  public TripEpisode getTripEpisode(@PathVariable int episodeId) {
      TripEpisode episode = tripEpisodeService.findByEpisodeNo(episodeId);
      return episode; 
  }

  @GetMapping("/episodes")
  public List<TripEpisode> findAll() {
      List<TripEpisode> episodes = tripEpisodeService.findAll();
      return episodes;
  }

  @PostMapping("/episodes")
  public TripEpisode addTripEpisodes(@RequestBody TripEpisode tripEpisode) {
    TripEpisode episode = tripEpisodeService.save(tripEpisode);
    return episode;
  }
}