package com.mediglass.Mediglass.App.services;

import com.mediglass.Mediglass.App.models.Articulos;
import com.mediglass.Mediglass.App.models.Clientes;
import com.mediglass.Mediglass.App.repositories.ArticulosDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ArticulosServicios {

    @Autowired
    ArticulosDAO articulosRepositorio;

    public ArrayList<Articulos> obtenerArticulos() { return (ArrayList<Articulos>) articulosRepositorio.findAllByOrderCodigoArt(); }

    public Articulos obtenerDatosArticulos(Integer id) {
        return articulosRepositorio.findPorId(id);
    }

    public Articulos editarDatosArticulos(Articulos articulo) {
        return articulosRepositorio.save(articulo);
    }

    public Integer buscarMaxArticulos() {
        return articulosRepositorio.buscarMax();
    }

    public void borrarArticulo(Integer id) {
        articulosRepositorio.deleteById(id);
    }

    public ArrayList<Articulos> articulosUnidadesMayorCero() {
        return articulosRepositorio.articulosMayoresQueCero();
    }

    public ArrayList<Articulos> obtenerTablaPorDescripcionOEurocode(String descripcion) {
        return articulosRepositorio.findByDescripcionOrEurocode(descripcion);
    }
}
