package com.flyease.flight_service.service;

import com.flyease.flight_service.model.Flight;
import com.flyease.flight_service.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightService {
    @Autowired
    private FlightRepository flightRepository;

    public Flight saveFlight(Flight flight) {
//        set flight refference in seatClass
        if(flight.getSeatClasses() != null){
            flight.getSeatClasses().forEach(seatClass -> seatClass.setFlight(flight));
        }
        return flightRepository.save(flight);
    }
}
