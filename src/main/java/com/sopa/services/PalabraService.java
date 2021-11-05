package com.sopa.services;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sopa.entities.Palabra;
import com.sopa.repositories.PalabraRepository;


@Component

public class PalabraService {
    @Autowired
    PalabraRepository wordRepo;

    protected EntityManager em;

    public PalabraService(EntityManager em) {
        this.em = em;
    }

    public List<Palabra> getAllWords(){
        List<Palabra> wordList = new ArrayList<>();
        wordRepo.findAll().forEach(wordList::add);
        return wordList;
    }

    public Palabra addWord(Palabra palabra) {
        palabra = wordRepo.save(palabra);
        return palabra;
    }

}
