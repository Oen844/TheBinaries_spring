package com.theBinaries.producto2.controllers;

import com.theBinaries.producto2.Repository.UserRepository;
import com.theBinaries.producto2.Repository.WordRepository;
import com.theBinaries.producto2.entities.Game;
import com.theBinaries.producto2.entities.User;
import com.theBinaries.producto2.entities.Word;
import com.theBinaries.producto2.service.GameService;
import com.theBinaries.producto2.service.UserService;
import com.theBinaries.producto2.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.view.RedirectView;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.TransformerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.view.RedirectView;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/game")
@SessionAttributes("game")

public class GameController {

    @Autowired
    WordRepository wordRepo;
    @Autowired
    WordService wordServ;
    @Autowired
    UserRepository userRepo;
    @Autowired
    UserService userServ;
    @Autowired
    GameService gameServ;


    @RequestMapping(method = RequestMethod.GET)
    public void words(ModelMap model) throws SQLException {
        List<Word> lista = wordServ.getAllWords();
        for (Word word : lista) {
            System.out.println(word.getWord());
        }
        Collection<String> words = CollectionUtils.collect(lista, TransformerUtils.invokerTransformer("getWord"));
        String palabras[] = (String[]) words.toArray(new String[0]);
        model.addAttribute("palabras", palabras);
    }

    @RequestMapping(method = RequestMethod.POST)
    public RedirectView gameData(Game game) throws SQLException {
        wordRepo.deleteAll();
        User userGame = userServ.lastUser();
        String nameGame = userGame.getUsername();
        userRepo.deleteAll();

        int duration = game.getDuration();
        int score = game.getScore();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
        LocalDateTime now = LocalDateTime.now();
        String gameDate = dtf.format(now);

        Game lastGame = new Game(gameDate, duration, score, nameGame);
        gameServ.addGame(lastGame);

        return new RedirectView("/all-games");

    }
}