package com.flyease.flight_service.service;

import com.flyease.flight_service.model.Flight;
import com.flyease.flight_service.model.SeatClass;
import com.flyease.flight_service.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public Optional<Flight> getFlightById(Long id) {
        return flightRepository.findById(id);
    }

    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public Flight saveFlight(Flight flight) {
//        set flight refference in seatClass
        for (SeatClass seat : flight.getSeatClasses()) {
            seat.setFlight(flight); // Set the reference properly
        }
        return flightRepository.save(flight);
    }
}
