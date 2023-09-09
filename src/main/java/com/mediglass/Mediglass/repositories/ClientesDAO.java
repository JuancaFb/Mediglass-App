package com.mediglass.Mediglass.repositories;

import com.mediglass.Mediglass.models.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Repository
@Transactional
public interface ClientesDAO extends JpaRepository<Clientes, Integer> {

    @Query("FROM Clientes order by nclientecli")
    ArrayList<Clientes> findAllByOrderNClienteCli();

    @Query("FROM Clientes WHERE nombrecli like %:nombrecli% ORDER BY nclientecli")
    ArrayList<Clientes> findByNombre(@Param("nombrecli") String nombre);

    @Query("FROM Clientes WHERE nclientecli = :nclientecli")
    Clientes findPorId(@Param("nclientecli") Integer id);

    @Query(value="SELECT max(nclientecli) FROM fclientes", nativeQuery = true)
    Integer buscarMax();

    void deleteById(Integer id);
}
