package com.andesfin.andesfin_investment_service.service;

import com.andesfin.andesfin_investment_service.dto.SimulationRequestDTO;
import com.andesfin.andesfin_investment_service.model.InvestmentSimulation;
import com.andesfin.andesfin_investment_service.repository.InvestmentSimulationRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class InvestmentSimulationService {

    private final InvestmentSimulationRepository repository;

    public InvestmentSimulationService(InvestmentSimulationRepository repository) {
        this.repository = repository;
    }

    public InvestmentSimulation simulate(SimulationRequestDTO dto) {

        BigDecimal finalAmount = dto.getAmount()
                .multiply(
                        BigDecimal.ONE.add(
                                dto.getInterestRate()
                                        .multiply(BigDecimal.valueOf(dto.getMonths()))
                        )
                );

        InvestmentSimulation simulation = new InvestmentSimulation();
        simulation.setInitialAmount(dto.getAmount());
        simulation.setInterestRate(dto.getInterestRate());
        simulation.setMonths(dto.getMonths());
        simulation.setFinalAmount(finalAmount);

        return repository.save(simulation);
    }
}
