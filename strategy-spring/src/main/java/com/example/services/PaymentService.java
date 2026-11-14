package com.example.services;

import com.example.annotations.PaymentType;
import com.example.enums.PaymentMethod;
import com.example.strategy.PaymentStrategy;
import com.example.strategy.PaymentStrategyWithType;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

@Service
public class PaymentService {

    private final Map<PaymentMethod, PaymentStrategy> strategyMap;

    public PaymentService(List<PaymentStrategy> strategyList) {
        this.strategyMap = new EnumMap<>(PaymentMethod.class);

        for (PaymentStrategy strategy : strategyList) {
            if (strategy instanceof PaymentStrategyWithType typed) {
                strategyMap.put(typed.getPaymentMethod(), strategy);
            }
        }
        /*this.strategyMap = strategyList.stream()
                .collect(Collectors.toMap( strategy -> {
                    PaymentType annotation = strategy.getClass().getAnnotation(PaymentType.class);
                    if (annotation == null)
                        throw new IllegalArgumentException("Missing @PaymentType on " + strategy.getClass().getName());
                    return annotation.value();
                }, Function.identity()));*/
    }

    public void processPayment(String paymentType, BigDecimal amount) {
        PaymentStrategy strategy = strategyMap.get(paymentType);
        if (strategy == null)
            throw new IllegalArgumentException("Unsupported payment type: " + paymentType);

        strategy.pay(amount);
    }
}
