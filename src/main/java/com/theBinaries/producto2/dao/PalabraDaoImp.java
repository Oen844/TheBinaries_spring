package com.theBinaries.producto2.dao;

import com.theBinaries.producto2.models.Palabra;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class PalabraDaoImp implements PalabraDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void registrar(Palabra palabra) {
        entityManager.merge(palabra);
    }
}
