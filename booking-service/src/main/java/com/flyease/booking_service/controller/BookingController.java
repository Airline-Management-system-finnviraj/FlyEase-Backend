package com.flyease.booking_service.controller;

import com.flyease.booking_service.model.Booking;
import com.flyease.booking_service.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @PostMapping
    public ResponseEntity<Booking> createBooking(@RequestBody Booking booking) {
        Booking createdBooking = bookingService.saveBooking(booking.getUser_id(),booking.getFlight_id(),booking.getSeatClass());
        return ResponseEntity.ok(createdBooking);
    }
}
