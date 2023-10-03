package com.mediglass.Mediglass.repositories;

import com.mediglass.Mediglass.models.ProveedoresPrueba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Repository
@Transactional
public interface ProveedoresPruebaDAO extends JpaRepository<ProveedoresPrueba, Integer> {

    @Query("FROM ProveedoresPrueba")
    ArrayList<ProveedoresPrueba> findAllByOrder();
}
