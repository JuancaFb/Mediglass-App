package com.mediglass.Mediglass.services;

import com.mediglass.Mediglass.models.Proveedores;
import com.mediglass.Mediglass.repositories.ProveedoresDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProveedoresServicios {

    @Autowired
    ProveedoresDAO proveedoresRepositorio;

    public ArrayList<Proveedores> obtenerProveedores() {
        return (ArrayList<Proveedores>) proveedoresRepositorio.findAllByOrderNProveedPro();
    }

    public ArrayList<Proveedores> obtenerNombreProveedor(String nombrepro) {
        return proveedoresRepositorio.findByNombre(nombrepro);
    }

    public Proveedores obtenerDatosProveedor(Integer id) {
        return proveedoresRepositorio.findPorId(id);
    }

    public Proveedores editarDatosProveedor(Proveedores proveedor) {
        return proveedoresRepositorio.save(proveedor);
    }

    public Integer buscarMaxProveedor(){
        return proveedoresRepositorio.buscarMax();
    }

    public void borrarProveedor(Integer id) {
        proveedoresRepositorio.deleteById(id);
    }
}
