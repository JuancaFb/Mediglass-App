package com.mediglass.Mediglass.App.repositories;

import com.mediglass.Mediglass.App.models.AlbaranesCompraL;
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

    @Query(value = "select * from falbacoml f2 where fedocdol = (select max(fedocdol) from falbacoml f where cdgoartdol = :cdgoartdol) and cdgoartdol = :cdgoartdol", nativeQuery = true)
    ArrayList<AlbaranesCompraL> findUltimoPrecioArticulo(@Param("cdgoartdol") String cdgoartdol);
}
