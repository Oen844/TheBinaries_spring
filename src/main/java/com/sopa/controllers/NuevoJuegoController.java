package com.sopa.controllers;

import java.sql.SQLException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.sopa.entities.Users;
import com.sopa.entities.Palabra;
import com.sopa.models.NuevoJuego;
import com.sopa.services.*;


@Controller
@RequestMapping("/nuevo-juego")
@SessionAttributes("nuevojuego")

public class NuevoJuegoController {
    @Autowired
    PalabraService wordServ;
    @Autowired
    UsersService userServ;

    @RequestMapping(method = RequestMethod.POST)
    public RedirectView gameData(NuevoJuego newGame) throws SQLException {
        System.out.println("Username= " + newGame.getUser());
        String name = newGame.getUser();
        if(name != "") {
            Users newUser = new Users(name);
            userServ.addUser(newUser);
        }
        String w1 = newGame.getWord1();
        String w2 = newGame.getWord2();
        String w3 = newGame.getWord3();
        String w4 = newGame.getWord4();
        String w5 = newGame.getWord5();

        if(w1 != "") {
            Palabra word1 = new Palabra(w1);
            wordServ.addWord(word1);
        }
        if(w2 != "") {
            Palabra word2 = new Palabra(w2);
            wordServ.addWord(word2);
        }
        if(w3 != "") {
            Palabra word3 = new Palabra(w3);
            wordServ.addWord(word3);
        }
        if(w4 != "") {
            Palabra word4 = new Palabra(w4);
            wordServ.addWord(word4);
        }
        if(w5 != "") {
            Palabra word5 = new Palabra(w5);
            wordServ.addWord(word5);
        }

        return new RedirectView("/game");
    }
}
