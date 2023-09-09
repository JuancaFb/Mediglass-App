package com.mediglass.Mediglass.controllers;

import com.mediglass.Mediglass.models.AlbaranesVentaL;
import com.mediglass.Mediglass.services.AlbaranesVentaLServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin("*")
@RestController
@RequestMapping("/albaranesventa")
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
