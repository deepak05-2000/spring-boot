package com.jobms.jobms.service;

import com.jobms.jobms.domain.Car;
import com.jobms.jobms.repository.CarRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CarServiceImpl {
    CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    public Car getCarById(Long id) {
        return carRepository.findById(id).get();
    }

    public Car updateCar(Car car) {
        return carRepository.save(car);
    }
}
