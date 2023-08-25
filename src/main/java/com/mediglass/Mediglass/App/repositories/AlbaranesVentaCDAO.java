package com.mediglass.Mediglass.App.repositories;

import com.mediglass.Mediglass.App.models.AlbaranesVentaC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface AlbaranesVentaCDAO extends JpaRepository<AlbaranesVentaC, Integer> {
}
