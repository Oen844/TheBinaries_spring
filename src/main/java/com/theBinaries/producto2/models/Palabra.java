package com.theBinaries.producto2.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "palabra")
public class Palabra {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "idPalabra")
    private int id;

    @Getter
    @Setter
    @Column(name = "palabra")
    private String palabra;



}