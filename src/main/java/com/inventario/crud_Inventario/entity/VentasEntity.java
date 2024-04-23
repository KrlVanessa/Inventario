package com.inventario.crud_Inventario.entity;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table (name = "ventas")

public class VentasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idVentas;
    private String nombre;
    private Integer cantidad;
    private Integer precioUnitario;
    private Timestamp fechaVentas;

    public VentasEntity() {
    }


    public VentasEntity(Integer idVentas, String nombre, Integer cantidad, Integer precioUnitario, Timestamp fechaVentas) {
        this.idVentas = idVentas;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.fechaVentas = fechaVentas;
    }

    public Integer getIdVentas() {
        return idVentas;
    }

    public void setIdVentas(Integer idVentas) {
        this.idVentas = idVentas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Integer precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Timestamp getFechaVentas() {
        return fechaVentas;
    }

    public void setFechaVentas(Timestamp fechaVentas) {
        this.fechaVentas = fechaVentas;
    }
}
