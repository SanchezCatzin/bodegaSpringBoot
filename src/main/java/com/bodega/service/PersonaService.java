package com.bodega.service;

import com.bodega.entity.Persona;
import com.bodega.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public Optional<Persona> getPersona(Integer id){
        return personaRepository.findById(id);
    }

    public List<Persona> getPersonas(){
        return personaRepository.findAll();
    }

    public Persona insertarPersona(Persona persona){
        return personaRepository.save(persona);
    }

    public Persona modificarPersona(Persona persona){
        return personaRepository.save(persona);
    }

    public void borrarPersona(Integer id){
        personaRepository.deleteById(id);
    }

}
