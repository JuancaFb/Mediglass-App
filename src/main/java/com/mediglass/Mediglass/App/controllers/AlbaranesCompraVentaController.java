package com.mediglass.Mediglass.App.controllers;

import com.mediglass.Mediglass.App.models.AlbaranesCompraL;
import com.mediglass.Mediglass.App.models.AlbaranesVentaL;
import com.mediglass.Mediglass.App.services.AlbaranesCompraVentaServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin

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
