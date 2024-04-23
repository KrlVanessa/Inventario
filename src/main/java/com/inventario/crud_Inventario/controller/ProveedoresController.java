package com.inventario.crud_Inventario.controller;

import com.inventario.crud_Inventario.entity.ProveedoresEntity;
import com.inventario.crud_Inventario.service.ProveedoresService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//http://localhost:8080/inventario/proveedores
@RequestMapping("/inventario/proveedores")
public class ProveedoresController {

    private final ProveedoresService proveedoresService;

    public ProveedoresController(ProveedoresService proveedoresService) {
        this.proveedoresService = proveedoresService;
    }

    //http://localhost:8080/inventario/proveedores
    @PostMapping("/create")
    public ProveedoresEntity save(@RequestBody ProveedoresEntity proveedoresEntity) {
        return proveedoresService.save(proveedoresEntity);
    }

    //http://localhost:8080/inventario/proveedores
    @GetMapping
    public List<ProveedoresEntity> findAll(){
        return proveedoresService.findAll();
    }

    //http://localhost:8080/inventario/proveedores/1
    @GetMapping("/{idProveedor}")
    public ProveedoresEntity findById(@PathVariable Integer idProveedor) {
        return proveedoresService.findById(idProveedor);
    }

    @DeleteMapping("/{idProveedor}")
    public void deleteById(@PathVariable Integer idProveedor) {
        proveedoresService.deleteById(idProveedor);
    }

    @PutMapping
    public ProveedoresEntity updateProveedores(@RequestBody ProveedoresEntity proveedoresEntity) {
        ProveedoresEntity ProveedoresDb = proveedoresService. findById(proveedoresEntity.getIdProveedor());
        ProveedoresDb.setNombre(proveedoresEntity.getNombre());
        ProveedoresDb.setEmpresa(proveedoresEntity.getEmpresa());
        ProveedoresDb.setTelefono(proveedoresEntity.getTelefono());
    return proveedoresService.update(ProveedoresDb);
    }

}


