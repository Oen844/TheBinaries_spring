package com.theBinaries.producto2.service;


import com.theBinaries.producto2.Repository.WordRepository;
import com.theBinaries.producto2.entities.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class WordService {

    @Autowired
    WordRepository wordRepo;

    protected EntityManager em;

    public WordService(EntityManager em) {
        this.em = em;
    }

    public List<Word> getAllWords(){
        List<Word> wordList = new ArrayList<>();
        wordRepo.findAll().forEach(wordList::add);
        return wordList;
    }

    public Word addWord(Word word) {
        word = wordRepo.save(word);
        return word;
    }

}