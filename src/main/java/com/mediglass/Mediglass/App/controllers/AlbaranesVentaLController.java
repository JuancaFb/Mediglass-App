package com.mediglass.Mediglass.App.controllers;

import com.mediglass.Mediglass.App.models.AlbaranesVentaL;
import com.mediglass.Mediglass.App.services.AlbaranesVentaLServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping("albaranesventa")
public class AlbaranesVentaLController {

    @Autowired
    private AlbaranesVentaLServicios albaranesVentaServicios;

    @GetMapping()
    public ArrayList<AlbaranesVentaL> obtenerAlbaranesVenta(){
        return albaranesVentaServicios.obtenerAlbaranesVenta();
    }

    @GetMapping("/{cdgoartdol}")
    public ArrayList<AlbaranesVentaL> obtenerUltimoPrecioArticulos(@PathVariable String cdgoartdol){
        return albaranesVentaServicios.obtenerUltimoPrecioArticulos(cdgoartdol);
    }
}
