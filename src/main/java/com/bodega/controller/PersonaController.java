package com.bodega.controller;

import com.bodega.entity.Persona;
import com.bodega.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("dev")
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping("/persona/{id}")
    public Optional<Persona> getPersona(@PathVariable Integer id){
        return personaService.getPersona(id);
    }

    @GetMapping("/personas")
    public List<Persona> getPersonas(){
        return personaService.getPersonas();
    }

    @PostMapping("/persona/insert")
    public Persona insertPersona(@RequestBody Persona persona){
        return personaService.insertarPersona(persona);
    }

    @PutMapping("/persona/modificar")
    public Persona modificar(@RequestBody Persona persona){
        return personaService.modificarPersona(persona);
    }

    @DeleteMapping("/persona/delete/{id}")
    public void delete(@PathVariable Integer id){
        personaService.borrarPersona(id);
    }

}
