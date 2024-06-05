package com.examen.App.web3.service;

import com.examen.App.web3.model.Brand;
import com.examen.App.web3.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class BrandService {
    @Autowired
    private BrandRepository brand ;
    public Optional<Brand> findById(Integer id){
        return brand.findById(id);
    }
    public List<Brand> findAll(){
        return  brand.findAll();
    }
    public  Brand save(Brand toSave){
        return  brand.save(toSave);
    }
    public  void delete (Integer id){
        brand.findById(id);
    }
}
