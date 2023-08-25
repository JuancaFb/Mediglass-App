package com.mediglass.Mediglass.App.repositories;

import com.mediglass.Mediglass.App.models.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;


@Repository
@Transactional
public interface UsuariosDAO extends JpaRepository<Usuarios, Integer> {

    @Query("FROM Usuarios WHERE user = :user and pass = :contra")
    ArrayList<Usuarios> findByUseryPass(@Param("user") Integer usuario, @Param("contra") String contra);

    @Query("FROM Usuarios WHERE user = :user")
    ArrayList<Usuarios> findByUser(@Param("user") Integer usuario);

}
