package com.andesfin.andesfin_investment_service.repository;

import com.andesfin.andesfin_investment_service.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
}
