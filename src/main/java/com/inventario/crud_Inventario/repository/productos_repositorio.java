package com.inventario.crud_Inventario.repository;

import com.inventario.crud_Inventario.entity.productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface productos_repositorio extends JpaRepository <productos, Integer> {



}
