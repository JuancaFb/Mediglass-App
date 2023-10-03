package com.mediglass.Mediglass.controllers;

import com.mediglass.Mediglass.models.Articulos;
import com.mediglass.Mediglass.services.ArticulosServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin("*")
@RestController
@RequestMapping("articulos")
public class ArticulosController {

    @Autowired
    private ArticulosServicios articulosServicios;

    @GetMapping()
    public ArrayList<Articulos> obtenerArticulos(){
        return articulosServicios.obtenerArticulos();
    }

    @PostMapping()
    public Integer buscarMaxArticulos(){
        return articulosServicios.buscarMaxArticulos();
    }

    @GetMapping("/{id}")
    public Articulos obtenerDatosArticulos(@PathVariable Integer id){
        return articulosServicios.obtenerDatosArticulos(id);
    }

    @DeleteMapping("/{id}")
    public void borrarArticulo(@PathVariable("id") Integer id){
        articulosServicios.borrarArticulo(id);
    }

    @PutMapping("/{id}")
    public Articulos editarArticulo(@RequestBody Articulos articulo, @PathVariable("id") Integer id) {
        articulo.setId(id);
        return articulosServicios.editarDatosArticulos(articulo);
    }

    @GetMapping("/mayorcero")
    public ArrayList<Articulos> articulosUnidadesMayorCero(){
        return articulosServicios.articulosUnidadesMayorCero();
    }

    @GetMapping("/busquedaAdmin/{descripcion}")
    public ArrayList<Articulos> obtenerTablaPorDescripcionOEurocode(@PathVariable String descripcion){
        return articulosServicios.obtenerTablaPorDescripcionOEurocode(descripcion);
    }
}
