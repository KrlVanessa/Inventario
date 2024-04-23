package com.inventario.crud_Inventario.service;
import com.inventario.crud_Inventario.entity.ProveedoresEntity;

import java.util.List;

public interface ProveedoresService {

    ProveedoresEntity save(ProveedoresEntity proveedor);
    List<ProveedoresEntity> findAll();
    ProveedoresEntity findById(Integer idProveedor);
    void deleteById(Integer idProveedor);
    ProveedoresEntity update(ProveedoresEntity proveedor);
}
