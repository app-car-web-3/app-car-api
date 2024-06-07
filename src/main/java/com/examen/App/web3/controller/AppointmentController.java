package com.examen.App.web3.controller;

import com.examen.App.web3.model.Appointment;
import com.examen.App.web3.model.Car;
import com.examen.App.web3.service.AppointmentService;
import com.examen.App.web3.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/appointment")
@CrossOrigin(origins = {"http://localhost:3000", "https://prod--dabanao.netlify.app"})

public class AppointmentController {
    @Autowired
    private AppointmentService appointmentService;
    @Autowired
    private CarService carService;

    @GetMapping("/{id}")
    public Optional<Appointment> findById(@PathVariable  Integer id){
        return  appointmentService.findById(id);
    }
    @GetMapping("/all")
    public List<Appointment>  findAll(){
        return appointmentService.findAll();
    }
    @PostMapping("/register")
    public ResponseEntity<Appointment> createAppointment(@RequestBody Appointment appointment) {
        Optional<Car> car = carService.findCarById(appointment.getCar().getCarId());
        if (car.isPresent()) {
            appointment.setCar(car.get());
            Appointment savedAppointment = appointmentService.register(appointment);
            return new ResponseEntity<>(savedAppointment, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id ){
        appointmentService.delete(id);
    }
}
