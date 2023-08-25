package com.mediglass.Mediglass.App.controllers;

import com.mediglass.Mediglass.App.models.Clientes;
import com.mediglass.Mediglass.App.services.ClientesServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "http://localhost:8100")

@RestController
@RequestMapping("clientes")
public class ClientesController {

    @Autowired
    private ClientesServicios clientesServicios;

    @GetMapping()
    public ArrayList<Clientes> obtenerClientes(){
        return clientesServicios.obtenerClientes();
    }

    @PostMapping("/{nombrecli}")
    public ArrayList<Clientes> obtenerNombreCliente(@PathVariable String nombrecli){
        return clientesServicios.obtenerNombreCliente(nombrecli);
    }

    @GetMapping("/{id}")
    public Clientes obtenerDatosCliente(@PathVariable Integer id){
        return clientesServicios.obtenerDatosCliente(id);
    }



    @PutMapping("/{id}")
    public Clientes editarClientes(@RequestBody Clientes cliente, @PathVariable("id") Integer id) {
        cliente.setId(id);
        return clientesServicios.editarDatosCliente(cliente);
    }

    @PostMapping()
    public Integer buscarMaxClientes(){
        return clientesServicios.buscarMaxClientes();
    }

    @DeleteMapping("/{id}")
    public void borrarCliente(@PathVariable("id") Integer id){
        clientesServicios.borrarCliente(id);
    }
}
