package com.mediglass.Mediglass.App.services;

import com.mediglass.Mediglass.App.repositories.AlbaranesVentaCDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbaranesVentaCServicios {

    @Autowired
    AlbaranesVentaCDAO albaranesVentaCRepositorio;
}
