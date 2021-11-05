package com.sopa.dao;

import com.sopa.models.Juego;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import java.util.List;

@Repository
@Transactional
public class JuegoDaoImp implements JuegoDao{

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Juego> getJuego() {
        String query = "FROM juego";
        return entityManager.createQuery(query).getResultList();

    }

    @Override
    @Transactional
    public void registrar(Juego juego) {
        entityManager.merge(juego);
    }

}
