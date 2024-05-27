package com.examen.App.web3.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "brand")

public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer brandId;
    private String name ;
    private String description ;
    @ManyToOne
    @JoinColumn(name = "image_id", referencedColumnName = "imageId")
    private Image imageId ;
}
