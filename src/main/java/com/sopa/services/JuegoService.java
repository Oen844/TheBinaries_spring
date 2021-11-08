package com.sopa.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.sopa.models.Juego;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.sopa.repositories.JuegoRepository;


@Component
public class JuegoService {
    @Autowired
    JuegoRepository juegoRepo;

    protected EntityManager em;

    public JuegoService(EntityManager em) {
        this.em = em;
    }

    public List<Juego> getAllJuegos(){
        List<Juego> juegoList = new ArrayList<>();
        juegoRepo.findAll().forEach(juegoList::add);
        return juegoList;
    }

    public Juego addJuego(Juego juego) {
        juego = juegoRepo.save(juego);
        return juego;
    }
}


