package com.theBinaries.producto2.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

	@RequestMapping("/")
	public String defaultHome() {
		return "login";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/denied")
	public String denied() {
		return "error";
	}
	@RequestMapping("/nuevoJuego")
	public String nuevoJuego() {
		return "nuevoJuego";
	}
	@RequestMapping("/juego")
	public String juego() {
		return "juego";
	}
	@RequestMapping("/lista")
	public String lista() {
		return "lista";
	}

}