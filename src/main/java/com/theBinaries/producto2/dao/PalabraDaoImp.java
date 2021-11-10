package com.theBinaries.producto2.dao;

import com.theBinaries.producto2.models.Palabra;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

public class PalabraDaoImp implements PalabraDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void registrar(Palabra palabra) {
        entityManager.merge(palabra);
    }

    @Override
    @Transactional
    public List<Palabra> getPalabra() {
        String query = "FROM Palabra";
        return entityManager.createQuery(query).getResultList();
    }

}
