package com.mediglass.Mediglass.App.controllers;

import com.mediglass.Mediglass.App.models.Proveedores2;
import com.mediglass.Mediglass.App.services.Proveedores2Servicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin("*")

@RestController
@RequestMapping("proveedores2")
public class Proveedores2Controller {

    @Autowired
    private Proveedores2Servicios proveedores2Servicios;

    @GetMapping()
    public ArrayList<Proveedores2> obtenerProveedores(){
        return proveedores2Servicios.obtenerProveedores();
    }

}
