package com.inventario.crud_Inventario.controller;

import com.inventario.crud_Inventario.entity.productos;
import com.inventario.crud_Inventario.service.productos_service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//http://localhost:8080/inventario/productos
@RequestMapping("/inventario/productos")
@CrossOrigin(origins = "http://localhost:4200")
public class productos_controller {

    private final productos_service productosService;
    public productos_controller(productos_service productosService) {
        this.productosService = productosService;
    }


    //http://localhost:8080/inventario/productos
    @PostMapping("/create")
    public productos save(@RequestBody productos producto) {
        return productosService.save(producto);

    }

    //http://localhost:8080/inventario/productos
    @GetMapping
    public List<productos> findAll(){
        return productosService.findAll();
    }

    //http://localhost:8080/inventario/productos/1
    @GetMapping("/{id}")
    public productos findById(@PathVariable int id) {
        return productosService.findById(id);
    }

    //http://localhost:8080/inventario/productos/1
    @DeleteMapping("/{id}")
    public  void deleteById(@PathVariable int id) {
        productosService.deleteById(id);
    }

    //http://localhost:8080/inventario/productos
    @PutMapping
    public productos update(@RequestBody productos producto) {
        productos productosDb = productosService.findById(producto.getId());
        productosDb.setNombre(producto.getNombre());
        productosDb.setCategoria(producto.getCategoria());
        productosDb.setDescripcion(producto.getDescripcion());
        productosDb.setCantidad(producto.getCantidad());
        productosDb.setPrecio(producto.getPrecio());
        return productosService.update(productosDb);
    }

}
