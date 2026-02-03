package com.andesfin.andesfin_investment_service.dto;

import java.math.BigDecimal;

public class ProductoSimulacionRequest {

    private String nombre;
    private BigDecimal precio;
    private BigDecimal porcentaje_ganancia;

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public BigDecimal getPrecio() { return precio; }
    public void setPrecio(BigDecimal precio) { this.precio = precio; }

    public BigDecimal getPorcentaje_ganancia() { return porcentaje_ganancia; }
    public void setPorcentaje_ganancia(BigDecimal porcentaje_ganancia) {
        this.porcentaje_ganancia = porcentaje_ganancia;
    }
}
