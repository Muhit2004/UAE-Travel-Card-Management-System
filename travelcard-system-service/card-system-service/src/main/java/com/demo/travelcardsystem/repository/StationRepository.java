package com.demo.travelcardsystem.repository;

import com.demo.travelcardsystem.entity.Station;
import com.demo.travelcardsystem.exception.InvalidDataProvidedException;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class StationRepository {

    private final Set<Station> stationStore = new HashSet<>();

    public boolean addAllStations(Set<Station> stations) {
        stationStore.clear();
        return stationStore.addAll(stations);
    }

    public Set<Station> getAllStations() {
        return this.stationStore;
    }

    public Station findStationByName(String stationName) {
        return stationStore.stream()
                .filter(station -> station.getName().equals(stationName))
                .findAny()
                .orElseThrow(InvalidDataProvidedException::new);
    }
}