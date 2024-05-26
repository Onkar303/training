package com.assignement.carhireservice.restcontroller;

import com.assignement.carhireservice.service.BookingService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }


    public void doNewBooking(){

    }






}
