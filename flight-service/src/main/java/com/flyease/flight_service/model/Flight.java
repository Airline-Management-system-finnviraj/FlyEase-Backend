package com.flyease.flight_service.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String flightNumber;
    private String airline;

//    Outbound flight details
    private String departureOrigin;
    private String departureDestination;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;

//    Return flight details
    private String returnOrigin;
    private String returnDestination;
    private LocalDateTime returnDepartureTime;
    private LocalDateTime returnArrivalTime;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getDepartureOrigin() {
        return departureOrigin;
    }

    public void setDepartureOrigin(String departureOrigin) {
        this.departureOrigin = departureOrigin;
    }

    public String getDepartureDestination() {
        return departureDestination;
    }

    public void setDepartureDestination(String departureDestination) {
        this.departureDestination = departureDestination;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getReturnOrigin() {
        return returnOrigin;
    }

    public void setReturnOrigin(String returnOrigin) {
        this.returnOrigin = returnOrigin;
    }

    public String getReturnDestination() {
        return returnDestination;
    }

    public void setReturnDestination(String returnDestination) {
        this.returnDestination = returnDestination;
    }

    public LocalDateTime getReturnDepartureTime() {
        return returnDepartureTime;
    }

    public void setReturnDepartureTime(LocalDateTime returnDepartureTime) {
        this.returnDepartureTime = returnDepartureTime;
    }

    public LocalDateTime getReturnArrivalTime() {
        return returnArrivalTime;
    }

    public void setReturnArrivalTime(LocalDateTime returnArrivalTime) {
        this.returnArrivalTime = returnArrivalTime;
    }
}
