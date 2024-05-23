package com.examen.App.web3.service;

import com.examen.App.web3.model.Image;
import com.examen.App.web3.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
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
    public void delete(Image image){
        imageRepository.deleteById(image.getImageId());
    }
}
