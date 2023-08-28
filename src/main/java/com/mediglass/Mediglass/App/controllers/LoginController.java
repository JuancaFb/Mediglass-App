package com.mediglass.Mediglass.App.controllers;

import com.mediglass.Mediglass.App.services.UsuarioServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin

@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    private UsuarioServicios usuarioServicios;

    @PostMapping("/{numuser}/{contrasena}")
    public boolean login(@PathVariable Integer numuser,@PathVariable String contrasena){
        if (usuarioServicios.verificarUserYPass(numuser, contrasena)) {
            return true;
        } else {
            return false;
        }
    }

}
