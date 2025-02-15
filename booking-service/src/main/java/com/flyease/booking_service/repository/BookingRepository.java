package com.flyease.booking_service.repository;

import com.flyease.booking_service.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository <Booking, Long>{
}
