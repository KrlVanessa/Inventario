package com.inventario.crud_Inventario.service;

import com.inventario.crud_Inventario.entity.productos;
import java.util.List;

public interface productos_service {

   productos save(productos producto);
   List<productos> findAll();
   productos findById(int id);
   void deleteById(int id);
   productos update(productos producto);

}
