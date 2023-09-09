package com.mediglass.Mediglass.services;

import com.mediglass.Mediglass.models.AlbaranesCompraL;
import com.mediglass.Mediglass.models.AlbaranesVentaL;
import com.mediglass.Mediglass.repositories.AlbaranesCompraVentaDAO;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AlbaranesCompraVentaServicios {


    AlbaranesCompraVentaDAO albaranesCompraVentaRepositorio;

    public Map<AlbaranesCompraL, AlbaranesVentaL> listadoMvtos(String cdgoartdol){
        return albaranesCompraVentaRepositorio.listadoMvtos(cdgoartdol);
    }
}
