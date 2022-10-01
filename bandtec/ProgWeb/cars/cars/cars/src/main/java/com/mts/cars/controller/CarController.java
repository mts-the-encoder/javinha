package com.mts.cars.controller;

import com.mts.cars.dto.CarDto;
import com.mts.cars.entity.CarEntity;
import com.mts.cars.repository.ICarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    ICarRepository carRepository;

    @PostMapping
    public ResponseEntity<CarDto> saveCar(@RequestBody CarDto carDto) {
        CarEntity newCar = new CarEntity();
        newCar = this.carRepository.save(newCar);
        carDto.convertDto(newCar);
        return ResponseEntity.status(200).body(carDto);
    }

    @GetMapping
    public ResponseEntity<List<CarDto>> listar() {
        List<CarEntity> cars = this.carRepository.findAll();
        List<CarDto> carsDto = new ArrayList<CarDto>();

        CarDto car = new CarDto();

        for (int i = 0; i < cars.size(); i++) {
            car.convertDto(cars.get(i));
            cars.add(cars.get(i));
        }
        if (cars.isEmpty()){
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(200).body(carsDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CarEntity> getById(@PathVariable Integer id) {
        return ResponseEntity.of(this.carRepository.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CarEntity> deleteById(@PathVariable Integer id) {
        if (this.carRepository.existsById(id)) {
            this.carRepository.deleteById(id);
            return ResponseEntity.status(200).build();
        }
        return ResponseEntity.status(404).build();
    }
}
