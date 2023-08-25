package com.mediglass.Mediglass.App.services;

import com.mediglass.Mediglass.App.models.AlbaranesCompraL;
import com.mediglass.Mediglass.App.repositories.AlbaranesCompraLDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AlbaranesCompraLServicios {

    @Autowired
    AlbaranesCompraLDAO albaranesCompraRepositorio;

    public ArrayList<AlbaranesCompraL> obtenerAlbaranesCompra() {
        return (ArrayList<AlbaranesCompraL>) albaranesCompraRepositorio.findAllByOrderNDocDol();
    }

    public ArrayList<AlbaranesCompraL> obtenerUltimoPrecioArticulos(String cdgoartdol) { return (ArrayList<AlbaranesCompraL>) albaranesCompraRepositorio.findUltimoPrecioArticulo(cdgoartdol); }

    public ArrayList<AlbaranesCompraL> obtenerAlbaranesEntreFechas(String fechaInicio, String fechaFin) { return (ArrayList<AlbaranesCompraL>) albaranesCompraRepositorio.findEntreFechas(fechaInicio, fechaFin); }


}
