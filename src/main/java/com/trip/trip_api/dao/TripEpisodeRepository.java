package com.trip.trip_api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trip.trip_api.entity.TripEpisode;

public interface TripEpisodeRepository extends JpaRepository<TripEpisode, Integer> {

    TripEpisode findByEpisodeNo(int episodeNo);
}