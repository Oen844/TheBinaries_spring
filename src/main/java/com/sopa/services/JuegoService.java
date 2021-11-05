package com.sopa.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.sopa.entities.Juego;
import com.sopa.repositories.JuegoRepository;


@Component
public class JuegoService {
    @Autowired
    JuegoRepository gameRepo;

    protected EntityManager em;

    public JuegoService(EntityManager em) {
        this.em = em;
    }

    public List<Juego> getAllGames(){
        List<Juego> gameList = new ArrayList<>();
        gameRepo.findAll().forEach(gameList::add);
        return gameList;
    }

    public Juego addGame(Juego juego) {
        juego = gameRepo.save(juego);
        return juego;
    }
}


