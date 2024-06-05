package com.examen.App.web3.service;

import com.examen.App.web3.model.Appointment;
import com.examen.App.web3.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {
    @Autowired
    private AppointmentRepository appointmentRepository;
    public  Optional<Appointment>findById(Integer id){ return appointmentRepository.findById(id);}
    public List<Appointment> findAll(){return appointmentRepository.findAll();}
    public Appointment register(Appointment appointment){
        return appointmentRepository.save(appointment);
    }
    public void delete(Integer id){
        appointmentRepository.deleteById(id);
    }
}
