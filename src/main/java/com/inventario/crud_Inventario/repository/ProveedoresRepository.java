package com.inventario.crud_Inventario.repository;

import com.inventario.crud_Inventario.entity.ProveedoresEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedoresRepository  extends JpaRepository <ProveedoresEntity, Integer>{

}
