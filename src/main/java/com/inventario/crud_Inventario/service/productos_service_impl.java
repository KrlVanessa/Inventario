package com.inventario.crud_Inventario.service;

import com.inventario.crud_Inventario.entity.productos;
import com.inventario.crud_Inventario.exepction.ResourceNotFoundException;
import com.inventario.crud_Inventario.repository.productos_repositorio;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class productos_service_impl implements productos_service{

    private final productos_repositorio productos_repositorio;


    public productos_service_impl(com.inventario.crud_Inventario.repository.productos_repositorio productos_repositorio) {
        this.productos_repositorio = productos_repositorio;
    }

    @Override
    public productos save(productos producto) {return productos_repositorio.save(producto);}

    @Override
    public List<productos> findAll() {
        return productos_repositorio.findAll(); // Nos permite obtener todos los objectos
    }

    @Override
    public productos findById(int id) {
        productos productos = productos_repositorio.findById(id).orElseThrow(
                ()->{
                    throw new ResourceNotFoundException("Producto con id " + id + " no encontrado");
                }
        );
        //return productos_repositorio.findById(id).get();
        return productos;
    }

    @Override
    public void deleteById(int id) {
        productos_repositorio.deleteById(id);

    }

    @Override
    public productos update(productos producto) {
        return productos_repositorio.save(producto);

    }
}
