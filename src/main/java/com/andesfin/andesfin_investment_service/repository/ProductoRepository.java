package com.andesfin.andesfin_investment_service.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andesfin.andesfin_investment_service.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

    List<Producto> findByActivoTrue();
}
