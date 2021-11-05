package com.sopa.controllers;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.List;

import com.sopa.entities.Juego;
import com.sopa.entities.Palabra;
import com.sopa.entities.Users;
import com.sopa.repositories.PalabraRepository;
import com.sopa.repositories.UsersRepository;
import com.sopa.services.JuegoService;
import com.sopa.services.PalabraService;
import com.sopa.services.UsersService;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.TransformerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.view.RedirectView;



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
        Palabra palabra = null;
        for (Palabra word : lista) {
            System.out.println(palabra.getWord());
        }
        Collection<String> words = CollectionUtils.collect(lista, TransformerUtils.invokerTransformer("getWord"));
        String palabras[] = (String[]) words.toArray(new String[0]);
        model.addAttribute("words", words);
    }

    @RequestMapping(method = RequestMethod.POST)
    public RedirectView gameData(Juego juego) throws SQLException {
        wordRepo.deleteAll();
        Users userGame = userServ.lastUser();
        String nameGame = userGame.getUsername();
        userRepo.deleteAll();

        int duration = juego.getDuracion();
        int score = juego.getPuntos();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
        LocalDateTime now = LocalDateTime.now();
        String gameDate = dtf.format(now);

        int duracion = 0;
        int puntos = 0;

        Juego lastJuego = new Juego(duracion, puntos, juego);
        gameServ.addGame(lastJuego);

        return new RedirectView("/lista");

    }
}
