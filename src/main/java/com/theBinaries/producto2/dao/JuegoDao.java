package com.theBinaries.producto2.dao;

import com.theBinaries.producto2.models.Juego;

import java.util.List;

public interface JuegoDao {

    List<Juego> getJuego();

    void registrar(Juego juego);

}
