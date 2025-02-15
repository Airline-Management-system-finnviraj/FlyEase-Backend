package com.flyease.booking_service.feign;

import com.flyease.booking_service.model.FlightDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "FLIGHT-SERVICE")
public interface FlightClient {
    @GetMapping("flights/{id}")
    public ResponseEntity<FlightDTO> getFlightById(@PathVariable("id") Long id);
}
