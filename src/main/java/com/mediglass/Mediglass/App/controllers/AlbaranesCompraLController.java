package com.mediglass.Mediglass.App.controllers;

import com.mediglass.Mediglass.App.models.AlbaranesCompraL;
import com.mediglass.Mediglass.App.services.AlbaranesCompraLServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping("albaranescompral")
public class AlbaranesCompraLController {

    @Autowired
    private AlbaranesCompraLServicios albaranesCompraLServicios;

    @GetMapping()
    public ArrayList<AlbaranesCompraL> obtenerAlbaranesCompra(){
        return albaranesCompraLServicios.obtenerAlbaranesCompra();
    }

    @PostMapping("/{ndocdol}")
    public ArrayList<AlbaranesCompraL> obtenerAlbaranById(@PathVariable Integer ndocdol){
        return albaranesCompraLServicios.obtenerAlbaranById(ndocdol);
    }

    @GetMapping("/{cdgoartdol}")
    public ArrayList<AlbaranesCompraL> obtenerUltimoPrecioArticulos(@PathVariable String cdgoartdol){
        return albaranesCompraLServicios.obtenerUltimoPrecioArticulos(cdgoartdol);
    }
}
