package com.mediglass.Mediglass.repositories;

import com.mediglass.Mediglass.models.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.ArrayList;

@Repository
@Transactional
public interface ProveedoresDAO extends JpaRepository<Proveedores, Integer> {

    @Query("FROM Proveedores order by nproveedpro")
    ArrayList<Proveedores> findAllByOrderNProveedPro();

    @Query("FROM Proveedores WHERE nombrepro like %:nombrepro% ORDER BY nproveedpro")
    ArrayList<Proveedores> findByNombre(@Param("nombrepro") String nombrepro);

    @Query("FROM Proveedores WHERE nproveedpro = :nproveedpro")
    Proveedores findPorId(@Param("nproveedpro") Integer id);

    @Query(value="SELECT max(nproveedpro) FROM fproveedores", nativeQuery = true)
    Integer buscarMax();

    void deleteById(Integer id);
}
