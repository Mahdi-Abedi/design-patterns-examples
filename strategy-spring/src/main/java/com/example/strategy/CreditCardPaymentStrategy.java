package com.example.strategy;

import com.example.annotations.PaymentType;
import com.example.enums.PaymentMethod;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
//@PaymentType(PaymentMethod.CREDIT_CARD)
//public class CreditCardPaymentStrategy implements PaymentStrategy {
public class CreditCardPaymentStrategy implements PaymentStrategyWithType {

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Processing credit card payment: " + amount);
    }

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.CREDIT_CARD;
    }
}
