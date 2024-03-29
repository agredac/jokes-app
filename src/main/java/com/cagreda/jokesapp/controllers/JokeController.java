package com.cagreda.jokesapp.controllers;

import com.cagreda.jokesapp.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
public class JokeController {

    JokesService jokesService;

    @Autowired
    public JokeController(JokesService jokesService) {
        this.jokesService = jokesService;
    }

    @RequestMapping("/")
    public  String getJoke(Model model){

        model.addAttribute("joke",jokesService.getChuckNorrisJoke());
        return "chucknorris";
    }
}
