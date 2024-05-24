package com.assignement.carhireservice.repository;

import com.assignement.carhireservice.dto.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface CarRepository extends CrudRepository<Car, UUID> {

    List<Car> findAll();

    Car save(Car car);
}
