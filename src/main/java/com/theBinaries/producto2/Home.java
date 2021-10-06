package com.theBinaries.producto2;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class Home {

    @RequestMapping("/mensaje")
    public String mensaje() {

        return "mensaje";
    }
}