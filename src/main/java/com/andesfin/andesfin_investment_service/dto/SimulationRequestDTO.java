package com.andesfin.andesfin_investment_service.dto;

import java.math.BigDecimal;

public class SimulationRequestDTO {

    private BigDecimal amount;
    private BigDecimal interestRate;
    private Integer months;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public Integer getMonths() {
        return months;
    }

    public void setMonths(Integer months) {
        this.months = months;
    }
}
