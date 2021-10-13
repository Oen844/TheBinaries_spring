package com.theBinaries.producto2;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Home {


    @GetMapping("/")
    public String index(){
        return "<h1>Inicio completo producto 2</h1>";
    }

}
