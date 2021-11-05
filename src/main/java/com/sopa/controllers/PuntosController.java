package com.sopa.controllers;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.view.RedirectView;

import com.sopa.entities.Juego;
import com.sopa.repositories.UsersRepository;
import com.sopa.repositories.PalabraRepository;
import com.sopa.services.JuegoService;
import com.sopa.services.UsersService;
import com.sopa.services.PalabraService;

@Controller
@RequestMapping("/lista")
@SessionAttributes("lista")

public class PuntosController {
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
    public void games(ModelMap model) throws SQLException {
        List<Juego> lista = gameServ.getAllGames();
        model.addAttribute("scores", lista);

    }

    @RequestMapping(method = RequestMethod.POST)
    public RedirectView RedirectView (ModelMap model) throws SQLException {
        return new RedirectView("/new-game");
    }

}
