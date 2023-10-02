package com.mediglass.Mediglass.App.services;

import com.mediglass.Mediglass.App.models.AlbaranesCompraL;
import com.mediglass.Mediglass.App.models.AlbaranesVentaL;
import com.mediglass.Mediglass.App.repositories.AlbaranesCompraVentaDAO;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AlbaranesCompraVentaServicios {


    AlbaranesCompraVentaDAO albaranesCompraVentaRepositorio;

    public Map<AlbaranesCompraL, AlbaranesVentaL> listadoMvtos(String cdgoartdol){
        return albaranesCompraVentaRepositorio.listadoMvtos(cdgoartdol);
    }
}
