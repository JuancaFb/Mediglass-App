package com.mediglass.Mediglass.services;

import com.mediglass.Mediglass.models.AlbaranesVentaL;
import com.mediglass.Mediglass.repositories.AlbaranesVentaLDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AlbaranesVentaLServicios {

    @Autowired
    AlbaranesVentaLDAO albaranesVentaLRepositorio;

    public ArrayList<AlbaranesVentaL> obtenerAlbaranesVenta() {
        return (ArrayList<AlbaranesVentaL>) albaranesVentaLRepositorio.findAllByOrderNDocDol();
    }

    public ArrayList<AlbaranesVentaL> obtenerUltimoPrecioArticulos(String cdgoartdol) { return (ArrayList<AlbaranesVentaL>) albaranesVentaLRepositorio.findUltimoPrecioArticulo(cdgoartdol); }

}
