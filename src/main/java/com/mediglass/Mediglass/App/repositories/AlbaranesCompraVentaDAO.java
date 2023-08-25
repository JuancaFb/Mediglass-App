package com.mediglass.Mediglass.App.repositories;

import com.mediglass.Mediglass.App.models.AlbaranesCompraL;
import com.mediglass.Mediglass.App.models.AlbaranesVentaL;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Map;

@Repository
@Transactional
public interface AlbaranesCompraVentaDAO extends Map<AlbaranesCompraL, AlbaranesVentaL> {

    @Query(value = "(SELECT ndocdol, fedocdol, unidadesdol FROM falbacoml WHERE cdgoartdol = :cdgoartdol) union (SELECT ndocdol, fedocdol, unidadesdol FROM falbavtal WHERE cdgoartdol = :cdgoartdol) order by 2 asc", nativeQuery = true)
    Map<AlbaranesCompraL, AlbaranesVentaL> listadoMvtos(@Param ("cdgoartdol") String cdgoartdol);
}
