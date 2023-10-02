package com.mediglass.Mediglass.App.controllers;

import com.mediglass.Mediglass.App.models.AlbaranesCompraC;
import com.mediglass.Mediglass.App.services.AlbaranesCompraCServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping("albaranescomprac")
public class AlbaranesCompraCController {

    @Autowired
    private AlbaranesCompraCServicios albaranesCompraCServicios;

    @GetMapping("/{fechaInicio}/{fechaFin}")
    public ArrayList<AlbaranesCompraC> obtenerAlbaranesEntreFechas(@PathVariable String fechaInicio, @PathVariable String fechaFin){
        return albaranesCompraCServicios.obtenerAlbaranesEntreFechas(fechaInicio, fechaFin);
    }

    @GetMapping("/{id}")
    public AlbaranesCompraC ObtenerDatosDeAlbaran(@PathVariable Integer id){
        return albaranesCompraCServicios.ObtenerDatosDeAlbaran(id);
    }
}
