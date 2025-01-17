package com.trip.trip_api.dao;

import com.trip.trip_api.entity.TripEpisode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripEpisodeRepository extends JpaRepository<TripEpisode, Integer> {
}