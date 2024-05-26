package com.assignement.carhireservice.restcontroller;

import com.assignement.carhireservice.model.Car;
import com.assignement.carhireservice.service.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/hire/car")
public class CarController {

    CarService carService;

    public CarController(final CarService carService) {
        this.carService = carService;
    }


    @GetMapping("/all")
    public List<Car> bookCar() {
        return carService.listAllCars();
    }

    @GetMapping()
    public void getAvailableCars(){

    }



}
