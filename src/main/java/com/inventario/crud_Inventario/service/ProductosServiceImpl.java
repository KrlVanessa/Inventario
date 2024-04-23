package com.inventario.crud_Inventario.service;

import com.inventario.crud_Inventario.entity.ProductosEntity;
import com.inventario.crud_Inventario.exepction.ResourceNotFoundException;
import com.inventario.crud_Inventario.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class ProductosServiceImpl implements ProductosService {

    private final ProductosRepository ProductosRepository;

    @Autowired
    public ProductosServiceImpl(ProductosRepository ProductosRepository) {
        this.ProductosRepository = ProductosRepository;
    }

    @Override
    public ProductosEntity save(ProductosEntity producto) {return ProductosRepository.save(producto);}

    @Override
    public List<ProductosEntity> findAll() {
        return ProductosRepository.findAll(); // Nos permite obtener todos los objectos
    }

    @Override
    public ProductosEntity findById(Integer  id) {
        ProductosEntity ProductosEntity = ProductosRepository.findById(id).orElseThrow(
                ()->{
                    throw new ResourceNotFoundException("Producto con id " + id + " no encontrado");
                }
        );
        //return productos_repositorio.findById(id).get();
        return ProductosEntity;
    }

    @Override
    public void deleteById(Integer  id) {
        ProductosRepository.deleteById(id);

    }

    @Override
    public ProductosEntity update(ProductosEntity producto) {
        return ProductosRepository.save(producto);

    }
}