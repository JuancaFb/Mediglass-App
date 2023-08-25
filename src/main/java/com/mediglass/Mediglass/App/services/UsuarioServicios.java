package com.mediglass.Mediglass.App.services;

import com.mediglass.Mediglass.App.models.Usuarios;
import com.mediglass.Mediglass.App.repositories.UsuariosDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuarioServicios {

    @Autowired
    UsuariosDAO usuarioRepositorio;

    public ArrayList<Usuarios> obtenerUsuarios() {
        return (ArrayList<Usuarios>) usuarioRepositorio.findAll();
    }

    public boolean verificarUserYPass(Integer numuser, String contra) {
        ArrayList<Usuarios> lista = usuarioRepositorio.findByUseryPass(numuser, contra);
        return !lista.isEmpty();
    }

    public ArrayList<Usuarios> obtenerUsuarioByUser(Integer numuser) {
        return usuarioRepositorio.findByUser(numuser);
    }


}
