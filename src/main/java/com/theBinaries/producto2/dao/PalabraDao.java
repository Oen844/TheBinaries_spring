package com.theBinaries.producto2.dao;

import com.theBinaries.producto2.models.Palabra;

import java.util.List;

public interface PalabraDao {

    void registrar(Palabra palabra);

    List<Palabra> getPalabra();
}
