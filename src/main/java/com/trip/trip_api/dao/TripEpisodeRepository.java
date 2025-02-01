package com.trip.trip_api.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trip.trip_api.entity.TripEpisode;

public interface TripEpisodeRepository extends JpaRepository<TripEpisode, Integer> {

    Optional<TripEpisode> findByEpisodeNo(int episodeNo);
}