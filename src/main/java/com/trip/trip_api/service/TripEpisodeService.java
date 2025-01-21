package com.trip.trip_api.service;

import java.util.List;

import com.trip.trip_api.entity.TripEpisode;

public interface TripEpisodeService {

    TripEpisode findById(int episodeNo);

    List<TripEpisode> findAll();

    TripEpisode save(TripEpisode tripEpisode);
}