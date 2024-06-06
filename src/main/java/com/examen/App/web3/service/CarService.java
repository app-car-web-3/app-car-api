package com.examen.App.web3.service;

import com.examen.App.web3.model.Car;
import com.examen.App.web3.model.Image;
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
    public void delete(Integer id){carRepository.deleteCarById(id);}
    public List<Car> findAllCarByBrand(String brand) {
        return carRepository.findCarsByBrandName(brand);
    }
    public  List<Car> findCarsByBrandModelContaining(String brand) {
        return carRepository.findCarsByBrandNameOrModelContaining(brand);
    }
    public Car updateCar(Integer id, Car newCarDetails) {
        Optional<Car> optionalCar = carRepository.findById(id);

        if (optionalCar.isPresent()) {
            Car existingCar = optionalCar.get();
            existingCar.setName(newCarDetails.getName());
            existingCar.setDescription(newCarDetails.getDescription());
            existingCar.setBrandId(newCarDetails.getBrandId());
            existingCar.setModel(newCarDetails.getModel());
            existingCar.setPrice(newCarDetails.getPrice());
            existingCar.setPrice(newCarDetails.getPrice());
            existingCar.setMotorType(newCarDetails.getMotorType());
            existingCar.setPower(newCarDetails.getPower());
            existingCar.setPlaceNumber(newCarDetails.getPlaceNumber());
            existingCar.setStatus(newCarDetails.getStatus());
            existingCar.setType(newCarDetails.getType());
            existingCar.setImageId(newCarDetails.getImageId());
            return carRepository.save(existingCar);
        } else {
            throw new RuntimeException("User not found with id  : " + id);
        }
    }

}
