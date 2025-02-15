package com.flyease.booking_service.service;

import com.flyease.booking_service.feign.FlightClient;
import com.flyease.booking_service.feign.UserClient;
import com.flyease.booking_service.model.Booking;
import com.flyease.booking_service.model.FlightDTO;
import com.flyease.booking_service.model.SeatClassDTO;
import com.flyease.booking_service.model.UserDTO;
import com.flyease.booking_service.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BookingService {
    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private UserClient userClient;

    @Autowired
    private FlightClient flightClient;

    public Booking saveBooking(Long userId, Long flightId,String seatClassType) {
//        Fetch flight details
        FlightDTO flight = flightClient.getFlightById(flightId).getBody();
//        Fetch User details
        UserDTO user = userClient.getUserById(userId).getBody();

//        Find the selected seatclass
        SeatClassDTO selectedSeatClass = flight.getSeatClasses().stream().filter(sc -> sc.getSeatClass().equalsIgnoreCase(seatClassType)).findFirst().orElseThrow(()-> new RuntimeException("Seat Class not available."));

        Booking booking = new Booking();
        booking.setUser_id(userId);
        booking.setFlight_id(flightId);
        booking.setSeatClass(seatClassType);
        booking.setPrice(selectedSeatClass.getPrice());
        booking.setBookingTime(LocalDateTime.now());

        return bookingRepository.save(booking);
    }

}
