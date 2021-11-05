package com.sopa.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Getter
    @Setter
    @Column(name = "idUser")
    private int id;

    @Getter @Setter @Column(name = "nombre")
    private String nombre;


    public Users( String nombre) {

        this.nombre = nombre;
    }


}
