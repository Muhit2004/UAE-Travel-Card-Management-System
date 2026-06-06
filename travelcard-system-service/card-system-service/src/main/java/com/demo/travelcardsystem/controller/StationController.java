package com.demo.travelcardsystem.controller;

import com.demo.travelcardsystem.entity.Station;
import com.demo.travelcardsystem.repository.StationRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "Station Management", description = "Endpoints for retrieving transit network stations and zone matrices")
public class StationController {

    private final StationRepository stationRepository;

    @Operation(summary = "Fetch all transit stations", description = "Returns a complete list of stations along with their assigned transport zones.")
    @GetMapping
    public Set<Station> fetchAllStations() {
        return stationRepository.getAllStations();
    }
}