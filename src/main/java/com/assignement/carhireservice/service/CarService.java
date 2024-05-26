package com.assignement.carhireservice.service;

import com.assignement.carhireservice.model.Car;
import com.assignement.carhireservice.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CarService {

    CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> listAllCars(){
        List<Car> carsList= carRepository.findAll();
        return carsList;
    }


    public Car findCarById(UUID id){
        return this.carRepository.findCarById(id);
    }
}
