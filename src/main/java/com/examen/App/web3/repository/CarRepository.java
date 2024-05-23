package com.examen.App.web3.repository;


import com.examen.App.web3.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CarRepository extends JpaRepository<Car,Integer> {
}
