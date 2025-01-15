package com.trip.trip_api.dao;

import com.trip.trip_api.entity.TripEpisodes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripEpisodesRepository extends JpaRepository<TripEpisodes, Integer> {
}