package com.trip.trip_api.service;

import java.util.List;

import com.trip.trip_api.entity.TripEpisode;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

public interface TripEpisodeService {

    TripEpisode findById(int episodeNo);

    TripEpisode findByEpisodeNo(int episodeNo);

    Page<TripEpisode> findAll(Pageable pageable);

    TripEpisode save(TripEpisode tripEpisode);
}