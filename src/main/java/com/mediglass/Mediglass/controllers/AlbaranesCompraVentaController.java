package com.mediglass.Mediglass.controllers;

import com.mediglass.Mediglass.models.AlbaranesCompraL;
import com.mediglass.Mediglass.models.AlbaranesVentaL;
import com.mediglass.Mediglass.services.AlbaranesCompraVentaServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin("*")
@RestController
@RequestMapping("albacompraventa")
public class AlbaranesCompraVentaController {

    @Autowired
    private AlbaranesCompraVentaServicios albacompraventa;

    @GetMapping("/{cdgoartdol}")
    public Map<AlbaranesCompraL, AlbaranesVentaL> obtenerMvtos(@PathVariable("cdgoartdol") String cdgoartdol){
        return albacompraventa.listadoMvtos(cdgoartdol);
    }

}
