package com.examen.App.web3.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer carId;
    @Column(nullable = false)
    private String name;
    @Column(columnDefinition = "TEXT")
    private String description;
    @ManyToOne
    @JoinColumn(name = "brand_id", referencedColumnName = "brandId",nullable = true)
    private Brand brandId;
    private String model;
    @Column(precision = 10, scale = 2)
    private BigDecimal price;
    private String color;
    private String motorType;
    private Integer power;
    private Integer placeNumber;
    @Enumerated(EnumType.STRING)
    private Status status;
    private String type;
    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "image_id", referencedColumnName = "imageId",nullable = true)
    private Image imageId;
    public enum Status {Pinned, NotPinned}
}
