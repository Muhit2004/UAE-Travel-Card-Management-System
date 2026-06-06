package com.demo.travelcardsystem.controller;

import com.demo.travelcardsystem.entity.Station;
import com.demo.travelcardsystem.repository.StationRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping(value = "/api/stations")
@AllArgsConstructor
@CrossOrigin
public class StationController {

    private final StationRepository stationRepository;

    @GetMapping
    public Set<Station> fetchAllStations() {
        return stationRepository.getAllStations();
    }
}