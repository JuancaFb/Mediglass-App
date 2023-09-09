package com.mediglass.Mediglass.services;

import com.mediglass.Mediglass.models.Clientes;
import com.mediglass.Mediglass.repositories.ClientesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClientesServicios {

    @Autowired
    ClientesDAO clientesRepositorio;

    public ArrayList<Clientes> obtenerClientes() {
        return (ArrayList<Clientes>) clientesRepositorio.findAllByOrderNClienteCli();
    }

    public ArrayList<Clientes> obtenerNombreCliente(String nombrecli) {
        return clientesRepositorio.findByNombre(nombrecli);
    }

    public Clientes obtenerDatosCliente(Integer id) {
        return clientesRepositorio.findPorId(id);
    }

    public Clientes editarDatosCliente(Clientes cliente) {
        return clientesRepositorio.save(cliente);
    }

    public Integer buscarMaxClientes(){
        return clientesRepositorio.buscarMax();
    }

    public void borrarCliente(Integer id) {
        clientesRepositorio.deleteById(id);
    }

}
