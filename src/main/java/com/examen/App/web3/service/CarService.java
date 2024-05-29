package com.examen.App.web3.service;

import com.examen.App.web3.model.Car;
import com.examen.App.web3.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class CarService {
    @Autowired
    private CarRepository carRepository;

    public Optional<Car> findCarById(Integer id){
        return  carRepository.findById(id);
    }
    public List<Car> findAllCar(){
        return  carRepository.findAll();
    }
    public Car saveCar(Car car){
        return carRepository.save(car);
    }
    public void delete(Car car){
        carRepository.deleteById(car.getCarId());
    }
    public List<Car> findAllCarByBrand(String brand) {
        return carRepository.findCarsByBrandName(brand);
    }
    public  List<Car> findCarsByBrandModelContaining(String brand) {
        return carRepository.findCarsByBrandNameOrModelContaining(brand);
    }

}
