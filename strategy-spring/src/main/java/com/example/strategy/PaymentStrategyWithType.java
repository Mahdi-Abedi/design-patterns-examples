package com.example.strategy;

import com.example.enums.PaymentMethod;

public interface PaymentStrategyWithType extends PaymentStrategy{
    PaymentMethod getPaymentMethod();
}
