package com.theBinaries.producto2.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "juego")
public class Juego {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "idJuego")
    private int id;

    @Getter
    @Setter
    @Column(name = "duracion")
    private int duracion;

    @Getter
    @Setter
    @Column(name = "puntos")
    private int puntos;

    @Getter
    @Setter
    @Column(name = "username")
    private String username;


}
