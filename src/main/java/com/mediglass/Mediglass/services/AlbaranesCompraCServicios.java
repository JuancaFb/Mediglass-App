package com.mediglass.Mediglass.services;

import com.mediglass.Mediglass.repositories.AlbaranesCompraCDAO;
import com.mediglass.Mediglass.models.AlbaranesCompraC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AlbaranesCompraCServicios {

    @Autowired
    AlbaranesCompraCDAO albaranesCompraCRepositorio;

    public ArrayList<AlbaranesCompraC> obtenerAlbaranesEntreFechas(String fechaInicio, String fechaFin) { return (ArrayList<AlbaranesCompraC>) albaranesCompraCRepositorio.findEntreFechas(fechaInicio, fechaFin); }

    public AlbaranesCompraC ObtenerDatosDeAlbaran(Integer id){
        return (AlbaranesCompraC) albaranesCompraCRepositorio.ObtenerDatosDeAlbaran(id);
    }
}
