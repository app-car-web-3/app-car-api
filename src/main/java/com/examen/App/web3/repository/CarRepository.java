package com.examen.App.web3.repository;


import com.examen.App.web3.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface CarRepository extends JpaRepository<Car,Integer> {
    @Query("SELECT c FROM Car c INNER JOIN c.brandId b WHERE b.name = :brandName")
    List<Car> findCarsByBrandName(@Param("brandName") String brandName);


}
