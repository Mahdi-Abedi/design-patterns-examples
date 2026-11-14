package com.example.strategy;

import java.math.BigDecimal;

public final class ThresholdDiscount implements DiscountStrategy {

    private final BigDecimal threshold;
    private final BigDecimal discountAmount;

    public ThresholdDiscount(BigDecimal threshold, BigDecimal discountAmount) {
        this.threshold = threshold;
        this.discountAmount = discountAmount;
    }

    @Override
    public BigDecimal apply(BigDecimal originalAmount) {
        return originalAmount.compareTo(threshold) >= 0 ? originalAmount.subtract(discountAmount) : originalAmount;
    }
}
