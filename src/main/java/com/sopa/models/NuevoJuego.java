package com.sopa.models;

public class NuevoJuego {
    public String users;
    public String palabra1;
    public String palabra2;
    public String palabra3;
    public String palabra4;
    public String palabra5;

    public NuevoJuego() {

    }

    public NuevoJuego(String users, String palabra1, String palabra2, String palabra3, String palabra4, String palabra5) {
        this.users = users;
        this.palabra1 = palabra1;
        this.palabra2 = palabra2;
        this.palabra3 = palabra3;
        this.palabra4 = palabra4;
        this.palabra5 = palabra5;
    }

    public String getUsers() {
        return users;
    }
    public void setUsers(String users) {
        this.users = users;
    }
    public String getPalabra1() {
        return palabra1;
    }
    public void setPalabrad1(String palabra1) {
        this.palabra1 = palabra1;
    }
    public String getPalabra2() {
        return palabra2;
    }
    public void setPalabra2(String palabra2) {
        this.palabra2 = palabra2;
    }
    public String getPalabra3() {
        return palabra3;
    }
    public void setPalabra3(String palabra3) {
        this.palabra3 = palabra3;
    }
    public String getPalabra4() {
        return palabra4;
    }
    public void setPalabra4(String palabra4) {
        this.palabra4 = palabra4;
    }
    public String getPalabra5() {
        return palabra5;
    }
    public void setPalabra5(String palabra5) {
        this.palabra5 = palabra5;
    }

}
