package com.andesfin.andesfin_investment_service.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andesfin.andesfin_investment_service.entity.Simulacion;

public interface SimulacionRepository
        extends JpaRepository<Simulacion, Long> {

    List<Simulacion> findByUsuarioId(UUID usuarioId);
}
