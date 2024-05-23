package com.examen.App.web3.controller;

import com.examen.App.web3.model.Car;
import com.examen.App.web3.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/car")
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping("/all")
    public List<Car> findAll(){
        return  carService.findAllCar();
    }
    @GetMapping("/{id}")
    public Optional<Car> findById(@PathVariable Integer id){
        return  carService.findCarById(id);
    }

    @PostMapping("/register")
    public  Car register(@RequestBody  Car car){
        return carService.saveCar(car);
    }
    @DeleteMapping("/delete")
    public  void deleteCar(@RequestBody Car car){
        carService.delete(car);
    }
}
