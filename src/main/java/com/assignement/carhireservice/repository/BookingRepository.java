package com.assignement.carhireservice.repository;

import com.assignement.carhireservice.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BookingRepository extends JpaRepository<Booking, UUID>,CrudRepository<Booking,UUID> {

}