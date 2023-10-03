package com.mediglass.Mediglass.controllers;

import com.mediglass.Mediglass.models.ProveedoresPrueba;
import com.mediglass.Mediglass.services.ProveedoresPruebaServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin("*")
@RestController
@RequestMapping("proveedoresprueba")
public class ProveedoresPruebaController {

    @Autowired
    private ProveedoresPruebaServicios proveedoresPServicios;

    @GetMapping()
    public ArrayList<ProveedoresPrueba> obtenerProveedoresPrueba(){
        return proveedoresPServicios.obtenerProveedores();
    }

}
