package com.andesfin.andesfin_investment_service.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andesfin.andesfin_investment_service.dto.SimulacionRequest;
import com.andesfin.andesfin_investment_service.service.SimulacionService;

@RestController
@RequestMapping("/simulaciones")
public class SimulacionController {

    private final SimulacionService simulacionService;

    public SimulacionController(SimulacionService simulacionService) {
        this.simulacionService = simulacionService;
    }

    @PostMapping
    public Map<String, Object> simular(@RequestBody SimulacionRequest request) {

        BigDecimal ganancia = simulacionService.simularGanancia(request);

        Map<String, Object> response = new HashMap<>();
        response.put("usuario_id", request.getUsuarioId());
        response.put("capital_invertido", request.getCapitalDisponible());
        response.put("ganancia_total", ganancia);
        response.put("capital_final", request.getCapitalDisponible().add(ganancia));

        return response;
    }
}
