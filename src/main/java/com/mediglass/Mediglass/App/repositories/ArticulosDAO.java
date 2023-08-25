package com.mediglass.Mediglass.App.repositories;

import com.mediglass.Mediglass.App.models.Articulos;
import com.mediglass.Mediglass.App.models.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Map;

@Repository
@Transactional
public interface ArticulosDAO extends JpaRepository<Articulos, Integer> {

    @Query("FROM Articulos order by codigoart")
    ArrayList<Articulos> findAllByOrderCodigoArt();

    @Query("FROM Articulos WHERE codigoart like :codigoart%")
    ArrayList<Articulos> findByEurocode(@Param ("codigoart") String codigoart);

    @Query("FROM Articulos WHERE descriart like %:descriart%")
    ArrayList<Articulos> findByDescripcion(@Param ("descriart") String descriart);

    @Query("FROM Articulos WHERE id = :id")
    Articulos findPorId(@Param("id") Integer id);

    @Query(value="SELECT max(id) FROM farticulos", nativeQuery = true)
    Integer buscarMax();

    @Query("FROM Articulos where stockart > 0")
    ArrayList<Articulos> articulosMayoresQueCero();

    @Query("FROM Articulos WHERE (descriart like %:descriart%) or (codigoart like %:descriart%)")
    ArrayList<Articulos> findByDescripcionOrEurocode(@Param ("descriart") String descriart);

    void deleteById(Integer id);
}
