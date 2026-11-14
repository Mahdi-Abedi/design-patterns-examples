package com.example.strategy;

import java.math.BigDecimal;

public final class NoDiscount implements DiscountStrategy {
    @Override
    public BigDecimal apply(BigDecimal originalAmount) {
        return originalAmount;
    }
}
