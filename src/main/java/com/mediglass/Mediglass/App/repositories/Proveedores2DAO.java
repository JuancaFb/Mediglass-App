package com.mediglass.Mediglass.App.repositories;

import com.mediglass.Mediglass.App.models.Proveedores2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Repository
@Transactional
public interface Proveedores2DAO extends JpaRepository<Proveedores2, Integer> {

    @Query("FROM Proveedores2")
    ArrayList<Proveedores2> findAllByOrderNProveedPro();
}
