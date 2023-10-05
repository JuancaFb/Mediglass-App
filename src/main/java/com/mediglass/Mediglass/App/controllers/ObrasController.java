package com.mediglass.Mediglass.App.controllers;

import com.mediglass.Mediglass.App.models.Obras;
import com.mediglass.Mediglass.App.services.ObrasServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping("obras")
public class ObrasController {

    @Autowired
    private ObrasServicios obrasServicios;

    @GetMapping()
    public ArrayList<Obras> obtenerObras(){
        return obrasServicios.obtenerObras();
    }

    @PostMapping()
    public Integer buscarMaxClientesObras(){
        return obrasServicios.buscarMaxClientesObra();
    }


    @GetMapping("/{nclienteobra}")
    public Obras obtenerDatosObra(@PathVariable Integer nclienteobra){
        return obrasServicios.obtenerDatosObra(nclienteobra);
    }

    @PostMapping("/{id}")
    public Obras obtenerDatosPorIdCliente(@PathVariable Integer id){
        return obrasServicios.obtenerDatosObrasIdCLiente(id);
    }

    @PutMapping("/{id}")
    public Obras editarObras(@RequestBody Obras obra, @PathVariable("id") Integer id) {
        obra.setId(id);
        return obrasServicios.editarDatosObras(obra);
    }

    @DeleteMapping("/{id}")
    public void borrarClienteYObra(@PathVariable("id") Integer id){
        obrasServicios.borrarClienteYObra(id);
    }

}
