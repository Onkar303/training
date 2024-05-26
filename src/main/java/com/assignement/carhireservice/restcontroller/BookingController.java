package com.assignement.carhireservice.restcontroller;

import com.assignement.carhireservice.dto.BookingRequestDto;
import com.assignement.carhireservice.model.Booking;
import com.assignement.carhireservice.service.BookingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/booking")
public class BookingController {

    BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }


    @PostMapping(path = "/new")
    public void doNewBooking(@RequestBody BookingRequestDto bookingRequestDto){
        bookingService.bookNewCar(bookingRequestDto);
    }

    @GetMapping(path = "/all")
    public List<Booking> findAllBookings(){
        return bookingService.getAllBookings();
    }






}
