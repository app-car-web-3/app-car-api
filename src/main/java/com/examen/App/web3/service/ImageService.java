package com.examen.App.web3.service;

import com.examen.App.web3.model.Brand;
import com.examen.App.web3.model.Car;
import com.examen.App.web3.model.Image;
import com.examen.App.web3.model.User;
import com.examen.App.web3.repository.BrandRepository;
import com.examen.App.web3.repository.CarRepository;
import com.examen.App.web3.repository.ImageRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ImageService {
    @Autowired
    private ImageRepository imageRepository;

    public Optional<Image> findById(Integer id){
        return  imageRepository.findById(id);
    }
    public List<Image> finAll(){
        return imageRepository.findAll();
    }
    public Image register(Image image){
        return  imageRepository.save(image);
    }
    public void delete(Integer id ){
        imageRepository.deleteImageById(id);
    }
    public Image updateImage(Integer id, Image newImageDetails) {
        Optional<Image> optionalImage = imageRepository.findById(id);

        if (optionalImage.isPresent()) {
            Image existingImage = optionalImage.get();
            existingImage.setName(newImageDetails.getName());
            existingImage.setUrl(newImageDetails.getUrl());
            return imageRepository.save(existingImage);
        } else {
            throw new RuntimeException("User not found with id  : " + id);
        }
    }
}
