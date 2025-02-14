package com.flyease.flight_service.controller;

import com.flyease.flight_service.model.SeatClass;
import com.flyease.flight_service.service.SeatClassService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/seat-classes")
public class SeatController {
    private final SeatClassService seatClassService;

    public SeatController(SeatClassService seatClassService) {
        this.seatClassService = seatClassService;
    }

    @GetMapping("/{flightId}")
    public List<SeatClass> getSeatClassByFlightId(@PathVariable Long flightId) {
        return seatClassService.getAllSeatClassesByFlight(flightId);
    }
}
