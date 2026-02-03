package com.andesfin.andesfin_investment_service.entity;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    private String id;

    private String nombre;
    private String email;

    @JsonProperty("capital_disponible")
    private BigDecimal capitalDisponible;

    // GETTERS Y SETTERS
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public BigDecimal getCapitalDisponible() { return capitalDisponible; }
    public void setCapitalDisponible(BigDecimal capitalDisponible) {
        this.capitalDisponible = capitalDisponible;
    }
}