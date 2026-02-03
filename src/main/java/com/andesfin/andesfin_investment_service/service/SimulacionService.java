package com.andesfin.andesfin_investment_service.service;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.andesfin.andesfin_investment_service.dto.ProductoSimulacionRequest;
import com.andesfin.andesfin_investment_service.dto.SimulacionRequest;

@Service
public class SimulacionService {

    public BigDecimal simularGanancia(SimulacionRequest request) {

        BigDecimal capital = request.getCapitalDisponible();
        BigDecimal gananciaTotal = BigDecimal.ZERO;

        List<ProductoSimulacionRequest> productos = request.getProductos();

        // Ordenar por mayor porcentaje de ganancia
        productos.sort(
            Comparator.comparing(ProductoSimulacionRequest::getPorcentaje_ganancia)
                      .reversed()
        );

        // Simulación
        for (ProductoSimulacionRequest p : productos) {

            if (capital.compareTo(p.getPrecio()) >= 0) {

                BigDecimal ganancia = p.getPrecio()
                        .multiply(p.getPorcentaje_ganancia())
                        .divide(BigDecimal.valueOf(100));

                gananciaTotal = gananciaTotal.add(ganancia);
                capital = capital.subtract(p.getPrecio());
            }
        }

        return gananciaTotal;
    }
}
