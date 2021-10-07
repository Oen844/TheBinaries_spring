package com.theBinaries.producto2;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class Home {


    @GetMapping("/")
    public String index(){
        return "<h1>Inicio completo</h1>";
    }

}