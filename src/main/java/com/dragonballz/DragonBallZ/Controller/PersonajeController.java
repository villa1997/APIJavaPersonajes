package com.dragonballz.DragonBallZ.Controller;

import com.dragonballz.DragonBallZ.Models.Personaje;
import com.dragonballz.DragonBallZ.Repository.IPersonajeRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "https://localhost:4200")
public class PersonajeController {

    @Autowired
    private IPersonajeRepositorio personajeRepositorio;

    @GetMapping("/personajes")
    public List<Personaje> ListAll(){return personajeRepositorio.findAll();}

}
