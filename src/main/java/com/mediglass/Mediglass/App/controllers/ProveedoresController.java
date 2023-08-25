package com.mediglass.Mediglass.App.controllers;

import com.mediglass.Mediglass.App.models.Proveedores;
import com.mediglass.Mediglass.App.services.ProveedoresServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "http://localhost:8100")

@RestController
@RequestMapping("proveedores")
public class ProveedoresController {

    @Autowired
    private ProveedoresServicios proveedoresServicios;

    @GetMapping()
    public ArrayList<Proveedores> obtenerProveedores(){
        return proveedoresServicios.obtenerProveedores();
    }

    @PostMapping("/{nombrepro}")
    public ArrayList<Proveedores> obtenerNombreProveedor(@PathVariable String nombrepro){
        return proveedoresServicios.obtenerNombreProveedor(nombrepro);
    }

    @GetMapping("/{id}")
    public Proveedores obtenerDatosProveedor(@PathVariable Integer id){
        return proveedoresServicios.obtenerDatosProveedor(id);
    }


    @PutMapping("/{id}")
    public Proveedores editarProveedor(@RequestBody Proveedores proveedor, @PathVariable("id") Integer id) {
        proveedor.setId(id);
        return proveedoresServicios.editarDatosProveedor(proveedor);
    }

    @PostMapping()
    public Integer buscarMaxProveedor(){
        return proveedoresServicios.buscarMaxProveedor();
    }

    @DeleteMapping("/{id}")
    public void borrarProveedor(@PathVariable("id") Integer id){
        proveedoresServicios.borrarProveedor(id);
    }
}
