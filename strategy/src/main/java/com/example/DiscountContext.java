package com.example;

import com.example.strategy.DiscountStrategy;

import java.math.BigDecimal;

public class DiscountContext {

    private DiscountStrategy strategy;

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public BigDecimal calculate(BigDecimal amount) {
        if (strategy == null )
            throw new IllegalArgumentException("Discount strategy is not set");
        return strategy.apply(amount);
    }
}
