package com.mediglass.Mediglass.App.controllers;

import com.mediglass.Mediglass.App.models.Articulos;
import com.mediglass.Mediglass.App.services.ArticulosServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "http://localhost:8100")

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

    @GetMapping("mayorcero")
    public ArrayList<Articulos> articulosUnidadesMayorCero(){
        return articulosServicios.articulosUnidadesMayorCero();
    }

    @GetMapping("busquedaAdmin/{descripcion}")
    public ArrayList<Articulos> obtenerTablaPorDescripcionOEurocode(@PathVariable String descripcion){
        return articulosServicios.obtenerTablaPorDescripcionOEurocode(descripcion);
    }
}
