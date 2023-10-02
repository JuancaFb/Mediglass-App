package com.mediglass.Mediglass.repositories;

import com.mediglass.Mediglass.models.AlbaranesCompraL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Repository
@Transactional
public interface AlbaranesCompraLDAO extends JpaRepository<AlbaranesCompraL, Integer> {

    @Query("FROM AlbaranesCompraL order by ndocdol")
    ArrayList<AlbaranesCompraL> findAllByOrderNDocDol();

    @Query("FROM AlbaranesCompraL where ndocdol = :ndocdol")
    ArrayList<AlbaranesCompraL> findByIdAlbaran(@Param("ndocdol") Integer ndocdol);

    @Query(value = "select * from falbacoml where fedocdol = (select max(fedocdol) from falbacoml f where cdgoartdol = :cdgoartdol) and cdgoartdol = :cdgoartdol", nativeQuery = true)
    ArrayList<AlbaranesCompraL> findUltimoPrecioArticulo(@Param("cdgoartdol") String cdgoartdol);

    @Query(value="SELECT max(id) FROM falbacoml", nativeQuery = true)
    Integer buscarMax();

    @Query(value = "FROM AlbaranesCompraL where ndocdol = :nalbadoc and fedocdol = :fealbadoc")
    ArrayList<AlbaranesCompraL> mostrarDatosAlbaran(@Param("nalbadoc") Integer nalbadoc, @Param("fealbadoc") String fealbadoc);
}
