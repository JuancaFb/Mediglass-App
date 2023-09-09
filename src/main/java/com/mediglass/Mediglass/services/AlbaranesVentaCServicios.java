package com.mediglass.Mediglass.services;

import com.mediglass.Mediglass.repositories.AlbaranesVentaCDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbaranesVentaCServicios {

    @Autowired
    AlbaranesVentaCDAO albaranesVentaCRepositorio;
}
