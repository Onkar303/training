package com.assignement.carhireservice.service;

import com.assignement.carhireservice.dto.BookingRequestDto;
import com.assignement.carhireservice.dto.BookingResponseDto;
import com.assignement.carhireservice.model.Booking;
import com.assignement.carhireservice.model.Car;
import com.assignement.carhireservice.model.Customer;
import com.assignement.carhireservice.repository.BookingRepository;
import com.assignement.carhireservice.repository.CarRepository;
import com.assignement.carhireservice.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingService {

    BookingRepository bookingRepository;
    CarRepository carRepository;
    CustomerRepository customerRepository;
    CarService carService;
    CustomerService customerService;

    public BookingService(BookingRepository bookingRepository, CarRepository carRepository, CustomerRepository customerRepository, CarService carService, CustomerService customerService) {
        this.bookingRepository = bookingRepository;
        this.carRepository = carRepository;
        this.customerRepository = customerRepository;
        this.carService = carService;
        this.customerService = customerService;
    }


    public BookingResponseDto bookNewCar(BookingRequestDto bookingRequestDto){

        Car car = carService.findCarById(bookingRequestDto.getCarId());
        Customer customer = customerService.findCustomerById(bookingRequestDto.getCustomerId());

        Booking booking = new Booking();

        booking.setEndDate(bookingRequestDto.getEndBookingDate());
        booking.setStartDate(bookingRequestDto.getStartBookingDate());

        List<Booking> list = new ArrayList<>();
        list.add(booking);
        car.setBookings(list);
        customer.setBookings(list);

        customerRepository.save(customer);
        carRepository.save(car);

        return null;
    }


    public List<Booking> getAllBookings(){
        return this.bookingRepository.findAll();
    }



}
