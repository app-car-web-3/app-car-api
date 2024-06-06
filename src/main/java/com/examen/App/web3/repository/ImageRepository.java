package com.examen.App.web3.repository;

import com.examen.App.web3.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface ImageRepository extends JpaRepository<Image, Integer> {
    @Query(value = "SELECT DeleteImage(:imageId);", nativeQuery = true)
    void deleteImageById(@Param("imageId") Integer imageId);

}
