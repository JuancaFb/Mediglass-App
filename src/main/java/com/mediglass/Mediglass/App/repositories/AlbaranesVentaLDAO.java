package com.mediglass.Mediglass.App.repositories;

import com.mediglass.Mediglass.App.models.AlbaranesVentaL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Repository
@Transactional
public interface AlbaranesVentaLDAO extends JpaRepository<AlbaranesVentaL, Integer> {

    @Query("FROM AlbaranesVentaL order by ndocdol")
    ArrayList<AlbaranesVentaL> findAllByOrderNDocDol();

    @Query(value = "select * from falbavtal f2 where fedocdol = (select max(fedocdol) from falbavtal f where cdgoartdol = :cdgoartdol) and cdgoartdol = :cdgoartdol", nativeQuery = true)
    ArrayList<AlbaranesVentaL> findUltimoPrecioArticulo(@Param("cdgoartdol") String cdgoartdol);
}
