package com.andesfin.andesfin_investment_service.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andesfin.andesfin_investment_service.dto.SimulationRequestDTO;
import com.andesfin.andesfin_investment_service.model.InvestmentSimulation;
import com.andesfin.andesfin_investment_service.repository.InvestmentSimulationRepository;
import com.andesfin.andesfin_investment_service.service.InvestmentSimulationService;

@RestController
@RequestMapping("/api/investments")
public class InvestmentSimulationController {

    private final InvestmentSimulationService service;
    private final InvestmentSimulationRepository repository;

    public InvestmentSimulationController(
            InvestmentSimulationService service,
            InvestmentSimulationRepository repository) {
        this.service = service;
        this.repository = repository;
    }

    // 1️⃣ Simular inversión
    @PostMapping("/simulate")
    public InvestmentSimulation simulate(@RequestBody SimulationRequestDTO dto) {
        return service.simulate(dto);
    }

    // 2️⃣ Listar simulaciones
    @GetMapping
    public List<InvestmentSimulation> findAll() {
        return repository.findAll();
    }

    // 3️⃣ Obtener simulación por ID
    @GetMapping("/{id}")
    public InvestmentSimulation findById(@PathVariable UUID id) {
        return repository.findById(id).orElseThrow();
    }

    // 4️⃣ Eliminar simulación
    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id) {
        repository.deleteById(id);
    }
}
