package com.flyease.flight_service.repository;

import com.flyease.flight_service.model.SeatClass;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatClassRepository extends JpaRepository<SeatClass, Long> {
    List<SeatClass> findByFlightId(Long flightId);
}
