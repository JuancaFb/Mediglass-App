package com.mediglass.Mediglass.App.services;

import com.mediglass.Mediglass.App.models.AlbaranesCompraC;
import com.mediglass.Mediglass.App.repositories.AlbaranesCompraCDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AlbaranesCompraCServicios {

    @Autowired
    AlbaranesCompraCDAO albaranesCompraCRepositorio;

    public ArrayList<AlbaranesCompraC> obtenerAlbaranesEntreFechas(String fechaInicio, String fechaFin) { return (ArrayList<AlbaranesCompraC>) albaranesCompraCRepositorio.findEntreFechas(fechaInicio, fechaFin); }

}
