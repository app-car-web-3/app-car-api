package com.examen.App.web3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "users")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_user",nullable = false)
    private UUID id ;
    @Column(name = "name",nullable = false)
    String name ;
    @Column(name = "email",nullable = false)
    String email ;
    @Column(name = "password",nullable = false)
    String password;

}
