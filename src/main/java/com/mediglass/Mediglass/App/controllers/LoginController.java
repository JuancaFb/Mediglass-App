package com.mediglass.Mediglass.App.controllers;

import com.mediglass.Mediglass.App.services.UsuarioServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8100")

@RestController
@RequestMapping("login")
public class LoginController {

    @Autowired
    private UsuarioServicios usuarioServicios;

    @PostMapping("/{numuser}/{contra}")
    public boolean login(@PathVariable Integer numuser,@PathVariable String contra){
        if (usuarioServicios.verificarUserYPass(numuser, contra)) {
            return true;
        } else {
            return false;
        }
    }

}
