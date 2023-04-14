package com.bodega.repository;

import com.bodega.entity.Departamento;
import com.bodega.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository <Departamento, Integer>{

}
