package com.example.strategy;

import java.math.BigDecimal;

public final class PercentageDiscount implements DiscountStrategy {

    private final double percentage;

    public PercentageDiscount(double percentage) {
        if (percentage < 0 || percentage > 100)
            throw  new IllegalArgumentException("Percentage has invalid value [0-100].");
        this.percentage = percentage;
    }

    @Override
    public BigDecimal apply(BigDecimal originalAmount) {
        return originalAmount.multiply(BigDecimal.ONE.subtract(BigDecimal.valueOf(percentage)));
    }
}
