package com.andesfin.andesfin_investment_service.dto;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimulacionRequest {

    @JsonProperty("usuario_id")
    private String usuarioId;

    @JsonProperty("capital_disponible")
    private BigDecimal capitalDisponible;

    private List<ProductoSimulacionRequest> productos;

    public String getUsuarioId() { return usuarioId; }
    public void setUsuarioId(String usuarioId) { this.usuarioId = usuarioId; }

    public BigDecimal getCapitalDisponible() { return capitalDisponible; }
    public void setCapitalDisponible(BigDecimal capitalDisponible) {
        this.capitalDisponible = capitalDisponible;
    }

    public List<ProductoSimulacionRequest> getProductos() { return productos; }
    public void setProductos(List<ProductoSimulacionRequest> productos) {
        this.productos = productos;
    }
}
