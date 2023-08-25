package com.mediglass.Mediglass.App.controllers;

import com.mediglass.Mediglass.App.models.AlbaranesCompraL;
import com.mediglass.Mediglass.App.services.AlbaranesCompraLServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "http://localhost:8100")

@RestController
@RequestMapping("albaranescompral")
public class AlbaranesCompraLController {

    @Autowired
    private AlbaranesCompraLServicios albaranesCompraServicios;

    @GetMapping()
    public ArrayList<AlbaranesCompraL> obtenerAlbaranesCompra(){
        return albaranesCompraServicios.obtenerAlbaranesCompra();
    }

    @GetMapping("/{cdgoartdol}")
    public ArrayList<AlbaranesCompraL> obtenerUltimoPrecioArticulos(@PathVariable String cdgoartdol){
        return albaranesCompraServicios.obtenerUltimoPrecioArticulos(cdgoartdol);
    }

    @GetMapping("/{fechaInicio}/{fechaFin}")
    public ArrayList<AlbaranesCompraL> obtenerAlbaranesEntreFechas(@PathVariable String fechaInicio, @PathVariable String fechaFin){
        return albaranesCompraServicios.obtenerAlbaranesEntreFechas(fechaInicio, fechaFin);
    }





}
