package com.trip.trip_api.service;

import com.trip.trip_api.entity.TripEpisodes;
import java.util.Optional;

public interface TripEpisodesService {

    Optional<TripEpisodes> getTripEpisodesById(int id);
}