package com.mediglass.Mediglass.repositories;

import com.mediglass.Mediglass.models.AlbaranesVentaC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface AlbaranesVentaCDAO extends JpaRepository<AlbaranesVentaC, Integer> {
}
