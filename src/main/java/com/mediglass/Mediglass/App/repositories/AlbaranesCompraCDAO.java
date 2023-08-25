package com.mediglass.Mediglass.App.repositories;

import com.mediglass.Mediglass.App.models.AlbaranesCompraC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Repository
@Transactional
public interface AlbaranesCompraCDAO extends JpaRepository<AlbaranesCompraC, Integer> {

    @Query("FROM AlbaranesCompraC where fealbadoc between :fechaInicio and :fechaFin order by fealbadoc")
    ArrayList<AlbaranesCompraC> findEntreFechas(@Param("fechaInicio") String fechaInicio, @Param("fechaFin") String fechaFin);
}
