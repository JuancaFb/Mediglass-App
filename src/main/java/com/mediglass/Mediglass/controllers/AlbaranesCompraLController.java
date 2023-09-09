package com.mediglass.Mediglass.controllers;

import com.mediglass.Mediglass.models.AlbaranesCompraL;
import com.mediglass.Mediglass.services.AlbaranesCompraLServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin("*")
@RestController
@RequestMapping("/albaranescompral")
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

    @GetMapping("/numalba/{nalbadoc}/{fealbadoc}")
    public ArrayList<AlbaranesCompraL> obtenerDatosAlbaran(@PathVariable Integer nalbadoc, @PathVariable String fealbadoc){
        return albaranesCompraLServicios.obtenerDatosAlbaran(nalbadoc, fealbadoc);
    }
}
