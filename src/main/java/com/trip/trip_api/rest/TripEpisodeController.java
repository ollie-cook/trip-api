package com.trip.trip_api.rest;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
  public Page<TripEpisode> findAll(@RequestParam(required = false) Integer page) {
      Page<TripEpisode> episodes = null;
      if (page == null) {
        episodes = tripEpisodeService.findAll(null);
      } else {
        Pageable pageable = PageRequest.of(page, 3);
        episodes = tripEpisodeService.findAll(pageable);
      }
      return episodes;
  }

  @PostMapping("/episodes")
  public TripEpisode addTripEpisodes(@RequestBody TripEpisode tripEpisode) {
    TripEpisode episode = tripEpisodeService.save(tripEpisode);
    return episode;
  }
}