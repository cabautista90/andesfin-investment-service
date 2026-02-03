package com.andesfin.andesfin_investment_service.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andesfin.andesfin_investment_service.model.InvestmentSimulation;

public interface InvestmentSimulationRepository
        extends JpaRepository<InvestmentSimulation, UUID> {
}
