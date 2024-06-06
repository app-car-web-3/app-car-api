package com.examen.App.web3.repository;


import com.examen.App.web3.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface CarRepository extends JpaRepository<Car,Integer> {
    @Query(value = "SELECT DeleteCar(:carId);", nativeQuery = true)
    void deleteCarById(@Param("carId") Integer imageId);

    @Query("SELECT c FROM Car c INNER JOIN c.brandId b WHERE b.name = :brandName")
    List<Car> findCarsByBrandName(@Param("brandName") String brandName);

    @Query("SELECT c FROM Car c INNER JOIN c.brandId b WHERE LOWER(b.name) LIKE CONCAT('%', LOWER(:keyword), '%') OR LOWER(c.model) LIKE CONCAT('%', LOWER(:keyword), '%')")
    List<Car> findCarsByBrandNameOrModelContaining(@Param("keyword") String keyword);

}
