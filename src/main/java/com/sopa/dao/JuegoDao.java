package com.sopa.dao;

import com.sopa.models.Juego;

import java.util.List;

public interface JuegoDao {

    List<Juego> getJuego();

    void registrar(Juego juego);

}
