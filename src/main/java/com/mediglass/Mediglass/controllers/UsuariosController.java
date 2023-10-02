package com.mediglass.Mediglass.controllers;

import com.mediglass.Mediglass.services.UsuarioServicios;
import com.mediglass.Mediglass.models.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin("*")
@RestController
@RequestMapping("/usuario")
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
