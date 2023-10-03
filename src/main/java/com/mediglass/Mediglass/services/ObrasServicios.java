package com.mediglass.Mediglass.services;

import com.mediglass.Mediglass.models.Obras;
import com.mediglass.Mediglass.repositories.ObrasDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ObrasServicios {

    @Autowired
    ObrasDAO obrasRepositorio;

    public ArrayList<Obras> obtenerObras() {
        return (ArrayList<Obras>) obrasRepositorio.findAllByOrderNClienteObra();
    }

    public Obras obtenerDatosObra(Integer id) {
        return obrasRepositorio.findPorNcliente(id);
    }

    public Obras obtenerDatosObrasIdCLiente(Integer id) { return obrasRepositorio.findPorIdCliente(id); }

    public Obras editarDatosObras(Obras obra) {
        return obrasRepositorio.save(obra);
    }

    public Integer buscarMaxClientesObra(){
        return obrasRepositorio.buscarMax();
    }

    public void borrarClienteYObra(Integer id) {
        obrasRepositorio.deleteById(id);
    }

}
