package com.inventario.crud_Inventario.service;

import com.inventario.crud_Inventario.entity.ProductosEntity;
import java.util.List;

public interface ProductosService {

   ProductosEntity save(ProductosEntity producto);
   List<ProductosEntity> findAll();
   ProductosEntity findById(int id);
   void deleteById(int id);
   ProductosEntity update(ProductosEntity producto);

}
