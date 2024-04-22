package com.inventario.crud_Inventario.service;

import com.inventario.crud_Inventario.entity.ProductosEntity;
import com.inventario.crud_Inventario.exepction.ResourceNotFoundException;
import com.inventario.crud_Inventario.repository.ProductosRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class ProductosServiceImpl implements ProductosService {

    private final ProductosRepositorio ProductosRepositorio;

@Autowired
    public ProductosServiceImpl(ProductosRepositorio ProductosRepositorio) {
        this.ProductosRepositorio = ProductosRepositorio;
    }

    @Override
    public ProductosEntity save(ProductosEntity producto) {return ProductosRepositorio.save(producto);}

    @Override
    public List<ProductosEntity> findAll() {
        return ProductosRepositorio.findAll(); // Nos permite obtener todos los objectos
    }

    @Override
    public ProductosEntity findById(int id) {
        ProductosEntity ProductosEntity = ProductosRepositorio.findById(id).orElseThrow(
                ()->{
                    throw new ResourceNotFoundException("Producto con id " + id + " no encontrado");
                }
        );
        //return productos_repositorio.findById(id).get();
        return ProductosEntity;
    }

    @Override
    public void deleteById(int id) {
        ProductosRepositorio.deleteById(id);

    }

    @Override
    public ProductosEntity update(ProductosEntity producto) {
        return ProductosRepositorio.save(producto);

    }
}
