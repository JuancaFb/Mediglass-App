package com.mediglass.Mediglass.App.repositories;

import com.mediglass.Mediglass.App.models.Clientes;
import com.mediglass.Mediglass.App.models.Obras;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Repository
@Transactional
public interface ObrasDAO extends JpaRepository<Obras, Integer>{

    @Query("FROM Obras order by nclienteobra")
    ArrayList<Obras> findAllByOrderNClienteObra();

    @Query("FROM Obras WHERE nclienteobra = :nclienteobra")
    Obras findPorNcliente(@Param("nclienteobra") Integer id);

    @Query(value="SELECT * FROM fobra fo, fclientes fc WHERE fc.nclientecli = fo.nclienteobra and fc.id = :id", nativeQuery = true)
    Obras findPorIdCliente(@Param("id") Integer id);

    @Query(value="SELECT max(id) FROM fobra", nativeQuery = true)
    Integer buscarMax();

    void deleteById(Integer id);

}
