package com.examen.App.web3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer appointmentId;

    @ManyToOne
    @JoinColumn(name = "car_id", referencedColumnName = "carId")
    private Car car;

    private String name;
    private String firstName;

    @Column(nullable = false)
    private String email;

    @Column(columnDefinition = "TEXT")
    private String message;

    private String contact;

    private LocalDateTime appointmentDate;

    @Enumerated(EnumType.STRING)
    private Status status;

    public enum Status {
        pending, validated, rejected,archived
    }

}
