package com.sopa.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Juego")

public class Juego {
    @Id
    @GeneratedValue(strategy=GenerationType.TABLE)
    private int id;
        private int duracion;
    private int puntos;
    private String username;

    public Juego() {

    }

    public Juego(int id, int duracion, int puntos, String username) {
        this.id = id;
        this.duracion = duracion;
        this.puntos = puntos;
        this.username = username;
    }

    public Juego(int duracion, int puntos, Juego juego) {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Game [idGame=" + id + ", duracion=" + duracion + ", puntos=" + puntos
                + ", username=" + username + "]";
    }
}
