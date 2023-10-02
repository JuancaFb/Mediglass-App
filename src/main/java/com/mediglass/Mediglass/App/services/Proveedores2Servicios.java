package com.mediglass.Mediglass.App.services;

import com.mediglass.Mediglass.App.models.Proveedores2;
import com.mediglass.Mediglass.App.repositories.Proveedores2DAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Proveedores2Servicios {

    @Autowired
    Proveedores2DAO proveedores2Repositorio;

    public ArrayList<Proveedores2> obtenerProveedores() {
        return (ArrayList<Proveedores2>) proveedores2Repositorio.findAllByOrderNProveedPro();
    }
}
