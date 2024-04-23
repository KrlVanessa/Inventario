package com.inventario.crud_Inventario.repository;

import com.inventario.crud_Inventario.entity.ProductosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductosRepository extends JpaRepository <ProductosEntity, Integer> {



}