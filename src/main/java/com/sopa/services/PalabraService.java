package com.sopa.services;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import com.sopa.models.Palabra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sopa.repositories.PalabraRepository;


@Component
public class PalabraService {

    @Autowired
    PalabraRepository palabraRepo;

    protected EntityManager em;

    public PalabraService(EntityManager em) {
        this.em = em;
    }

    public List<Palabra> getAllPalabras(){
        List<Palabra> palabraList = new ArrayList<>();
        palabraRepo.findAll().forEach(palabraList::add);
        return palabraList;
    }

    public Palabra addPalabra(Palabra palabra) {
        palabra = palabraRepo.save(palabra);
        return palabra;
    }

}