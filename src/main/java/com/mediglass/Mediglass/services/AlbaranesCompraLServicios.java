package com.mediglass.Mediglass.services;

import com.mediglass.Mediglass.models.AlbaranesCompraL;
import com.mediglass.Mediglass.repositories.AlbaranesCompraLDAO;
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

    public ArrayList<AlbaranesCompraL> obtenerAlbaranById(Integer ndocdol){
        return (ArrayList<AlbaranesCompraL>) albaranesCompraLRepositorio.findByIdAlbaran(ndocdol);
    }

    public ArrayList<AlbaranesCompraL> obtenerUltimoPrecioArticulos(String cdgoartdol) { return (ArrayList<AlbaranesCompraL>) albaranesCompraLRepositorio.findUltimoPrecioArticulo(cdgoartdol); }

    public ArrayList<AlbaranesCompraL> obtenerDatosAlbaran(Integer nalbadoc, String fealbadoc){
        return (ArrayList<AlbaranesCompraL>) albaranesCompraLRepositorio.mostrarDatosAlbaran(nalbadoc, fealbadoc);
    }
}
