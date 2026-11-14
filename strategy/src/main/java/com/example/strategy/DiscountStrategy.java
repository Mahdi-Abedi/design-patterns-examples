package com.example.strategy;

import java.math.BigDecimal;

public sealed interface DiscountStrategy permits  NoDiscount, PercentageDiscount, ThresholdDiscount, SeasonalDiscount {

    BigDecimal apply(BigDecimal originalAmount);
}
