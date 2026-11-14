package com.example.strategy;

import java.math.BigDecimal;

public final class SeasonalDiscount implements DiscountStrategy {

    private final double seasonPercentage;

    public SeasonalDiscount(double seasonPercentage) {
        if (seasonPercentage < 0 || seasonPercentage > 100)
            throw  new IllegalArgumentException("SeasonPercentage has invalid value [0-100].");
        this.seasonPercentage = seasonPercentage;
    }

    @Override
    public BigDecimal apply(BigDecimal originalAmount) {
        return originalAmount.multiply(BigDecimal.ONE.subtract(BigDecimal.valueOf(seasonPercentage)));
    }
}
