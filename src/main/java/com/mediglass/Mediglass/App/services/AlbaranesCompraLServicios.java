package com.mediglass.Mediglass.App.services;

import com.mediglass.Mediglass.App.models.AlbaranesCompraL;
import com.mediglass.Mediglass.App.repositories.AlbaranesCompraLDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AlbaranesCompraLServicios {

    @Autowired
    AlbaranesCompraLDAO albaranesCompraLRepositorio;

    public ArrayList<AlbaranesCompraL> obtenerAlbaranesCompra() {
        return (ArrayList<AlbaranesCompraL>) albaranesCompraLRepositorio.findAllByOrderNDocDol();
    }

    public ArrayList<AlbaranesCompraL> obtenerUltimoPrecioArticulos(String cdgoartdol) { return (ArrayList<AlbaranesCompraL>) albaranesCompraLRepositorio.findUltimoPrecioArticulo(cdgoartdol); }

}
