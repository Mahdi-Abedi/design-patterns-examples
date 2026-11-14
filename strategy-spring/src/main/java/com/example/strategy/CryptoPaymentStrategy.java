package com.example.strategy;

import com.example.annotations.PaymentType;
import com.example.enums.PaymentMethod;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
//@PaymentType(PaymentMethod.CRYPTO)
//public class CryptoPaymentStrategy implements PaymentStrategy{
public class CryptoPaymentStrategy implements PaymentStrategyWithType{

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Processing crypto payment: " + amount);
    }

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.CRYPTO;
    }
}
