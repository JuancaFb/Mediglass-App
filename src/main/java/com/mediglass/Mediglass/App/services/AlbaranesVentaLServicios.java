package com.mediglass.Mediglass.App.services;

import com.mediglass.Mediglass.App.models.AlbaranesVentaL;
import com.mediglass.Mediglass.App.repositories.AlbaranesVentaLDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AlbaranesVentaLServicios {

    @Autowired
    AlbaranesVentaLDAO albaranesVentaRepositorio;

    public ArrayList<AlbaranesVentaL> obtenerAlbaranesVenta() {
        return (ArrayList<AlbaranesVentaL>) albaranesVentaRepositorio.findAllByOrderNDocDol();
    }

    public ArrayList<AlbaranesVentaL> obtenerUltimoPrecioArticulos(String cdgoartdol) { return (ArrayList<AlbaranesVentaL>) albaranesVentaRepositorio.findUltimoPrecioArticulo(cdgoartdol); }

}
