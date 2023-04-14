package com.bodega.repository;

import com.bodega.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository <Producto, Integer> {
}
