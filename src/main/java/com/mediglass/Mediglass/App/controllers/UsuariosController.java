package com.mediglass.Mediglass.App.controllers;

import com.mediglass.Mediglass.App.models.Usuarios;
import com.mediglass.Mediglass.App.services.UsuarioServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*")

@RestController
@RequestMapping("usuario")
public class UsuariosController {

    @Autowired
    private UsuarioServicios usuarioServicios;

    @GetMapping()
    public ArrayList<Usuarios> obtenerUsuarios(){
        return usuarioServicios.obtenerUsuarios();
    }

    @PostMapping("/{numuser}")
    public ArrayList<Usuarios> obtenerUsuarioByUser(@PathVariable Integer numuser){
        return usuarioServicios.obtenerUsuarioByUser(numuser);
    }
}
