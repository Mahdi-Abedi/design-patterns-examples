package com.example.strategy;

import com.example.annotations.PaymentType;
import com.example.enums.PaymentMethod;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
//@PaymentType(PaymentMethod.PAYPAL)
//public class PayPalPaymentStrategy implements PaymentStrategy {
public class PayPalPaymentStrategy implements PaymentStrategyWithType {

    @Override
    public void pay(BigDecimal amount) {
        System.out.println("Processing PayPal payment: " + amount);
    }

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.PAYPAL;
    }
}
