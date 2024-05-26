package com.assignement.carhireservice.restcontroller;

import com.assignement.carhireservice.model.Car;
import com.assignement.carhireservice.service.CarService;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "/car")
public class CarController {

    CarService carService;

    public CarController(final CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/all")
    public List<Car> getAllCars() {
        return carService.listAllCars();
    }


    @GetMapping("/{id}")
    public Car findCarById(@PathVariable("id") UUID id) {
        return this.carService.findCarById(id);
    }

}
