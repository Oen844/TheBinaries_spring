package com.theBinaries.producto2.controllers;

import com.theBinaries.producto2.entities.User;
import com.theBinaries.producto2.entities.Word;
import com.theBinaries.producto2.models.NewGame;
import com.theBinaries.producto2.service.UserService;
import com.theBinaries.producto2.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.view.RedirectView;



import java.sql.SQLException;


@Controller
@RequestMapping("/nuevoJuego")
@SessionAttributes("nuevoJuego")

public class NuevoJuegoController {

    @Autowired
    WordService wordServ;
    @Autowired
    UserService userServ;

    @RequestMapping(method = RequestMethod.POST)
    public RedirectView gameData(NewGame newGame) throws SQLException {
        System.out.println("Username= " + newGame.getUser());
        String name = newGame.getUser();
        if(name != "") {
            User newUser = new User(name);
            userServ.addUser(newUser);
        }
        String w1 = newGame.getWord1();
        String w2 = newGame.getWord2();
        String w3 = newGame.getWord3();
        String w4 = newGame.getWord4();
        String w5 = newGame.getWord5();

        if(w1 != "") {
            Word word1 = new Word(w1);
            wordServ.addWord(word1);
        }
        if(w2 != "") {
            Word word2 = new Word(w2);
            wordServ.addWord(word2);
        }
        if(w3 != "") {
            Word word3 = new Word(w3);
            wordServ.addWord(word3);
        }
        if(w4 != "") {
            Word word4 = new Word(w4);
            wordServ.addWord(word4);
        }
        if(w5 != "") {
            Word word5 = new Word(w5);
            wordServ.addWord(word5);
        }

        return new RedirectView("/juego");
    }
}
