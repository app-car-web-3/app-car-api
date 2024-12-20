package com.examen.App.web3.controller;


import com.examen.App.web3.model.Brand;
import com.examen.App.web3.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/brand")
@CrossOrigin(origins = {"http://localhost:3000", "https://dabanao.netlify.app"})
public class BrandController {
    @Autowired
    private BrandService brandService;

    @GetMapping("/{id}")
    public Optional<Brand> findById(@PathVariable Integer id){
        return  brandService.findById(id);
    }
    @GetMapping("/all")
    public List<Brand> findAll(){
        return  brandService.findAll();
    }
    @PostMapping("/register")
    public  Brand register(@RequestBody Brand brand){
        return  brandService.save(brand);
    }

    @DeleteMapping("/{id}")
    public  void delete(@PathVariable Integer id){
        brandService.delete(id);
    }
}
