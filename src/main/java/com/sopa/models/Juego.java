package com.sopa.models;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "juego")
public class Juego {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)
    private int idJuego;
    private String gameDate;
    private int duracion;
    private int puntos;
    private String username;

    public Juego() {

    }

    public Juego(String gameDate, int duracion, int puntos, String username) {
        super();
        this.gameDate = gameDate;
        this.duracion = duracion;
        this.puntos = puntos;
        this.username = username;
    }

    public int getIdJuego() {
        return idJuego;
    }

    public void setIdJuego(int idJuego) {
        this.idJuego = idJuego;
    }

    public String getGameDate() {
        return gameDate;
    }

    public void setGameDate(String gameDate) {
        this.gameDate = gameDate;
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
        return "Juego [idJuego=" + idJuego + ", gameDate=" + gameDate + ", duracion=" + duracion + ", puntos=" + puntos
                + ", username=" + username + "]";
    }
}