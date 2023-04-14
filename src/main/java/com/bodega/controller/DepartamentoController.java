package com.bodega.controller;

import com.bodega.entity.Departamento;

import com.bodega.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("dev")
public class DepartamentoController {

    @Autowired
    DepartamentoService departamentoService;

    @GetMapping("/departamento/{id}")
    public Optional<Departamento> getDepartamento(@PathVariable Integer id){
        return departamentoService.getDepartamento(id);
    }

    @GetMapping("/departamentos")
    public List<Departamento> getDepartamento(){
        return departamentoService.getDepartamentos();
    }

    @PostMapping("/departamento/insert")
    public Departamento insertDepartamento(@RequestBody Departamento departamento){
        return departamentoService.insertarDepartamento(departamento);
    }

    @PutMapping("/departamento/modificar")
    public Departamento modificar(@RequestBody Departamento departamento){
        return departamentoService.modificarDepartamento(departamento);
    }

    @DeleteMapping("/departamento/delete/{id}")
    public void delete(@PathVariable Integer id){
        departamentoService.borrarDepartamento(id);
    }

}
