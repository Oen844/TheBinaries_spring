package com.sopa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "palabra")
public class Palabra {

    @Id
    @GeneratedValue(strategy=GenerationType.TABLE)
    private int idPalabra;
    private String palabra;

    public Palabra() {

    }

    public Palabra(String palabra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getIdPalabra() {
        return idPalabra;
    }

    public void setIdPalabra(int idPalabra) {
        this.idPalabra = idPalabra;
    }

    @Override
    public String toString() {
        return "Palabra [idPalabra=" + idPalabra + ", palabra=" + palabra + "]";
    }
}