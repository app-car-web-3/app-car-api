package com.examen.App.web3.controller;

import com.examen.App.web3.model.Image;
import com.examen.App.web3.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/image")
@CrossOrigin(origins = "http://localhost:3000")

public class ImageController {
    @Autowired
    private ImageService imageService;
    @GetMapping("/{id}")
    public Optional<Image> findById(@PathVariable Integer id){
        return  imageService.findById(id);
    }
    @GetMapping("/all")
    public List<Image> findAll(){
        return  imageService.finAll();
    }
    @PostMapping("/register")
    public Image register(@RequestBody Image image){
        return  imageService.register(image);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        imageService.delete(id);
    }


}
