package com.jobms.jobms.rest;

import com.jobms.jobms.domain.Car;
import com.jobms.jobms.service.CarServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/api")
public class CarResource {

    private static final Logger log = LoggerFactory.getLogger(CarResource.class);
    CarServiceImpl carService;

    public CarResource(CarServiceImpl carService) {
        this.carService = carService;
    }

    @PostMapping("/cars")
    ResponseEntity<Car> createCar(@RequestBody Car car) throws URISyntaxException {
        Car savedCar = carService.createCar(car);
        return ResponseEntity.created(new URI("/api/cars")).body(savedCar);
    }

    @GetMapping("/cars/{id}")
    ResponseEntity<Car> getCar(@PathVariable Long id) {
        return ResponseEntity.ok(carService.getCarById(id));
    }
    
    @PutMapping("/cars")
    ResponseEntity<Car> updateCar(@RequestBody Car car) {
        return ResponseEntity.ok().body(carService.updateCar(car));
    }
}
