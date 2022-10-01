package com.mts.cars.repository;

import com.mts.cars.dto.CarDto;
import com.mts.cars.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

public interface ICarRepository extends JpaRepository<CarEntity, Integer> {

}
