package com.inventario.crud_Inventario.service;

import com.inventario.crud_Inventario.entity.ProveedoresEntity;
import com.inventario.crud_Inventario.exepction.ResourceNotFoundException;
import com.inventario.crud_Inventario.repository.ProveedoresRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedoresServiceImpl implements ProveedoresService{

    private final ProveedoresRepository proveedoresRepository;

    public ProveedoresServiceImpl(ProveedoresRepository proveedoresRepository) {
        this.proveedoresRepository = proveedoresRepository;
    }

    @Override
    public ProveedoresEntity save(ProveedoresEntity proveedor) {
        return proveedoresRepository.save(proveedor);
    }

    @Override
    public List<ProveedoresEntity> findAll() {
        return proveedoresRepository.findAll();
    }

    @Override
    public ProveedoresEntity findById(Integer idProveedor) {
        ProveedoresEntity Proveedor = proveedoresRepository.findById(idProveedor).orElseThrow(
                () ->{
                    throw new ResourceNotFoundException("Proveedor con ID " + idProveedor + " no encontrado.");
                }
        );
       return Proveedor;

    }

    @Override
    public void deleteById(Integer idProveedor) {
        ProveedoresEntity proveedor = proveedoresRepository.findById(idProveedor).orElseThrow(() ->
                new ResourceNotFoundException("Proveedor con ID " + idProveedor + " no encontrado."));

        proveedoresRepository.delete(proveedor);
    }



    @Override
    public ProveedoresEntity update(ProveedoresEntity proveedor) {
        return proveedoresRepository.save(proveedor);
    }
}
