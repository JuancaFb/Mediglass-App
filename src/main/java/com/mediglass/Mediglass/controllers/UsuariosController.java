package com.mediglass.Mediglass.controllers;

import com.mediglass.Mediglass.models.Usuarios;
import com.mediglass.Mediglass.services.UsuariosServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin("*")
@RestController
@RequestMapping("usuarios")
public class UsuariosController {

    @Autowired
    private UsuariosServicios usuariosServicios;

    @GetMapping()
    public ArrayList<Usuarios> obtenerUsuarios(){
        return usuariosServicios.obtenerUsuarios();
    }

    @PostMapping("/{numuser}")
    public ArrayList<Usuarios> obtenerUsuarioByUser(@PathVariable Integer numuser){
        return usuariosServicios.obtenerUsuarioByUser(numuser);
    }
}
