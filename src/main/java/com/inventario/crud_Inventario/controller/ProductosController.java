package com.inventario.crud_Inventario.controller;

import com.inventario.crud_Inventario.entity.ProductosEntity;
import com.inventario.crud_Inventario.service.ProductosService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//http://localhost:8080/inventario/productos
@RequestMapping("/inventario/productos")
@CrossOrigin(origins = "http://localhost:4200")
public class ProductosController {

    private final ProductosService productosService;
    public ProductosController(ProductosService productosService) {
        this.productosService = productosService;
    }


    //http://localhost:8080/inventario/productos
    @PostMapping("/create")
    public ProductosEntity save(@RequestBody ProductosEntity producto) {
        return productosService.save(producto);

    }

    //http://localhost:8080/inventario/productos
    @GetMapping
    public List<ProductosEntity> findAll(){
        return productosService.findAll();
    }

    //http://localhost:8080/inventario/productos/1
    @GetMapping("/{id}")
    public ProductosEntity findById(@PathVariable Integer id) {
        return productosService.findById(id);
    }

    //http://localhost:8080/inventario/productos/1
    @DeleteMapping("/{id}")
    public  void deleteById(@PathVariable Integer id) {
        productosService.deleteById(id);
    }

    //http://localhost:8080/inventario/productos
    @PutMapping
    public ProductosEntity update(@RequestBody ProductosEntity producto) {
        ProductosEntity productosEntityDb = productosService.findById(producto.getId());
        productosEntityDb.setNombre(producto.getNombre());
        productosEntityDb.setCategoria(producto.getCategoria());
        productosEntityDb.setDescripcion(producto.getDescripcion());
        productosEntityDb.setCantidad(producto.getCantidad());
        productosEntityDb.setPrecio(producto.getPrecio());
        return productosService.update(productosEntityDb);
    }

}