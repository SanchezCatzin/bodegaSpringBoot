package com.bodega.service;

import com.bodega.entity.Departamento;

import com.bodega.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService {

    @Autowired
    DepartamentoRepository departamentoRepository;

    public Optional<Departamento> getDepartamento(Integer id){
        return departamentoRepository.findById(id);
    }

    public List<Departamento> getDepartamentos(){
        return departamentoRepository.findAll();
    }

    public Departamento insertarDepartamento(Departamento departamento){
        return departamentoRepository.save(departamento);
    }

    public Departamento modificarDepartamento(Departamento departamento){
        return departamentoRepository.save(departamento);
    }

    public void borrarDepartamento(Integer id){
        departamentoRepository.deleteById(id);
    }
}
