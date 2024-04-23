package com.inventario.crud_Inventario.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "proveedores")

public class ProveedoresEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProveedor;
    private String nombre;
    private String empresa;
    private Integer telefono;

    public ProveedoresEntity() {
    }

    public ProveedoresEntity(Integer idProveedor, String nombre, String empresa, Integer telefono) {
        this.idProveedor = idProveedor;
        this.nombre = nombre;
        this.empresa = empresa;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
}


