package com.mediglass.Mediglass.services;

import com.mediglass.Mediglass.repositories.UsuariosDAO;
import com.mediglass.Mediglass.models.Usuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UsuariosServicios {

    @Autowired
    UsuariosDAO usuarioRepositorio;

    public ArrayList<Usuarios> obtenerUsuarios() {
        return (ArrayList<Usuarios>) usuarioRepositorio.findAll();
    }

    public boolean verificarUserYPass(Integer numuser, String contrasena) {
        ArrayList<Usuarios> lista = usuarioRepositorio.findByUseryPass(numuser, contrasena);
        return !lista.isEmpty();
    }

    public ArrayList<Usuarios> obtenerUsuarioByUser(Integer numuser) {
        return usuarioRepositorio.findByUser(numuser);
    }


}
