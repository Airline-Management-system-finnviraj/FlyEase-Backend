package com.flyease.flight_service.service;

import com.flyease.flight_service.model.SeatClass;
import com.flyease.flight_service.repository.SeatClassRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatClassService {
    private final SeatClassRepository seatClassRepository;

    public SeatClassService(SeatClassRepository seatClassRepository) {
        this.seatClassRepository = seatClassRepository;
    }

    public List<SeatClass> getAllSeatClassesByFlight(Long flightId) {
        return seatClassRepository.findByFlightId(flightId);
    }
}
