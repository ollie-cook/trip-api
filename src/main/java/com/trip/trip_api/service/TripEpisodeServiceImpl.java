package com.trip.trip_api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.trip.trip_api.dao.TripEpisodeRepository;
import com.trip.trip_api.entity.TripEpisode;


@Service
public class TripEpisodeServiceImpl implements TripEpisodeService {

    @Autowired
    private TripEpisodeRepository tripEpisodeRepository;

    @Override
    public TripEpisode findById(int episodeNo) {

        Optional<TripEpisode> result = tripEpisodeRepository.findById(episodeNo);
        TripEpisode tripEpisode = null;
        if (result.isPresent()) {
            tripEpisode = result.get();
        } else {
            throw new RuntimeException("Did not find episode - " + episodeNo);
        }
        
        return tripEpisode;
    }

    @Override
    public TripEpisode findByEpisodeNo(int episodeNo) {

        Optional<TripEpisode> result = tripEpisodeRepository.findByEpisodeNo(episodeNo);
        TripEpisode tripEpisode = null;
        if (result.isPresent()) {
            tripEpisode = result.get();
        } else {
            throw new ResponseStatusException(
                HttpStatus.NOT_FOUND, "Did not find episode - " + episodeNo
            );
        }

        return tripEpisode;
    }

    @Override
    public List<TripEpisode> findAll() {
        List<TripEpisode> tripEpisodes = tripEpisodeRepository.findAll();
        return tripEpisodes;
    }

    @Override
    public TripEpisode save(TripEpisode tripEpisode) {
        TripEpisode episode = tripEpisodeRepository.save(tripEpisode);
        return episode;
    }
}