package com.mediglass.Mediglass.services;

import com.mediglass.Mediglass.models.ProveedoresPrueba;
import com.mediglass.Mediglass.repositories.ProveedoresPruebaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProveedoresPruebaServicios {

    @Autowired
    ProveedoresPruebaDAO proveedoresPRepositorio;

    public ArrayList<ProveedoresPrueba> obtenerProveedores() {
        return (ArrayList<ProveedoresPrueba>) proveedoresPRepositorio.findAllByOrder();
    }
}
