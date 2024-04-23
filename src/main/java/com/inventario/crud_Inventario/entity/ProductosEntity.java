
package com.inventario.crud_Inventario.entity;
import jakarta.persistence.*;


@Entity
@Table(name = "productos")

public class ProductosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String categoria;
    private String descripcion;
    private Integer cantidad;
    private Integer precio;


    public ProductosEntity() {

    }

    public ProductosEntity(Integer id, String nombre, String categoria, String descripcion, Integer cantidad, Integer precio) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getPrecio() {
        return precio;
    }
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }
}
