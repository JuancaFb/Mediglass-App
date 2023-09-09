package com.mediglass.Mediglass.repositories;

import com.mediglass.Mediglass.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;


@Repository
@Transactional
public interface UsuariosDAO extends JpaRepository<Usuarios, Integer> {

    @Query("FROM Usuarios WHERE numuser = :numuser and contrasena = :contrasena")
    ArrayList<Usuarios> findByUseryPass(@Param("numuser") Integer numuser, @Param("contrasena") String contrasena);

    @Query("FROM Usuarios WHERE numuser = :numuser")
    ArrayList<Usuarios> findByUser(@Param("numuser") Integer numuser);

}
