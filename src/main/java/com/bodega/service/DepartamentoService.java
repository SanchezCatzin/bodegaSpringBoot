package com.bodega.service;

import com.bodega.entity.Departamento;
import com.bodega.entity.Persona;
import com.bodega.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartamentoService {

    @Autowired
    DepartamentoRepository departamentoRepository;

    public Optional<Departamento> getDepartamento(Integer id){
        return departamentoRepository.findById(id);
    }
}
