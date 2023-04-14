package com.bodega.service;

import com.bodega.entity.Persona;
import com.bodega.entity.Producto;
import com.bodega.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {
    @Autowired
    ProductoRepository productoRepository;

    public Optional<Producto> getProducto(Integer id){
        return productoRepository.findById(id);
    }

    public List<Producto> getproductos(){
        return productoRepository.findAll();
    }

    public Producto insertarProducto(Producto producto){
        return productoRepository.save(producto);
    }

    public Producto modificarProducto(Producto producto){
        return productoRepository.save(producto);
    }

    public void borrarProducto(Integer id){
        productoRepository.deleteById(id);
    }

}
