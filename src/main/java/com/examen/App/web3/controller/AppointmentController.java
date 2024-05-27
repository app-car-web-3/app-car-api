package com.examen.App.web3.controller;

import com.examen.App.web3.model.Appointment;
import com.examen.App.web3.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/appointment")
@CrossOrigin(origins = "http://localhost:3000")

public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;
    @GetMapping("/{id}")
    public Optional<Appointment> findById(@PathVariable  Integer id){
        return  appointmentService.findById(id);
    }
    @GetMapping("/all")
    public List<Appointment>  findAll(){
        return appointmentService.findAll();
    }
    @PostMapping("/register")
    public Appointment register(@RequestBody Appointment appointment){
        return appointmentService.register(appointment);
    }
    @DeleteMapping("/delete")
    public void delete(@RequestBody Appointment appointment){
        appointmentService.delete(appointment);
    }
}
