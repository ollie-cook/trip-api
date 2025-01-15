package com.trip.trip_api.service;

import com.trip.trip_api.dao.TripEpisodesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.trip.trip_api.entity.TripEpisodes;
import org.springframework.stereotype.Service;
import java.util.Optional;



@Service
public class TripEpisodesServiceImpl implements TripEpisodesService {

    @Autowired
    private TripEpisodesRepository tripEpisodesRepository;

    @Override
    public Optional<TripEpisodes> getTripEpisodesById(int id) {
        Optional<TripEpisodes> tripEpisodes = tripEpisodesRepository.findById(id);
        return tripEpisodes;
    }
}