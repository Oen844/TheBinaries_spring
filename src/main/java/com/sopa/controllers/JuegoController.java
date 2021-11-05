package com.sopa.controllers;

import com.sopa.entities.Juego;
import com.sopa.entities.Palabra;
import com.sopa.repositories.PalabraRepository;
import com.sopa.repositories.UsersRepository;
import com.sopa.services.JuegoService;
import com.sopa.services.PalabraService;
import com.sopa.services.UsersService;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.TransformerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.CollectionUtils;
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
@RequestMapping("/juego")
@SessionAttributes("juego")

public class JuegoController {
    @Autowired
    PalabraRepository wordRepo;
    @Autowired
    PalabraService wordServ;
    @Autowired
    UsersRepository userRepo;
    @Autowired
    UsersService userServ;
    @Autowired
    JuegoService gameServ;


    @RequestMapping(method = RequestMethod.GET)
    public void words(ModelMap model) throws SQLException{
        List<Palabra> lista = wordServ.getAllWords();
        for (Palabra word : lista) {
            System.out.println(word.getWord());
        }
        Collection<String> words = CollectionUtils.collect(lista, TransformerUtils.invokerTransformer("getWord"));
        String words[] = (String[]) word.toArray(new String[0]);
        model.addAttribute("words", words);
    }

    @RequestMapping(method = RequestMethod.POST)
    public RedirectView gameData(Juego juego) throws SQLException {
        wordRepo.deleteAll();
        Users userGame = userServ.lastUser();
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
