package com.jobms.jobms.repository;

import com.jobms.jobms.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {}
