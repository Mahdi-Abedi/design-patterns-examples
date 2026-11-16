package com.example.factory.payment.paymentclient;

import com.example.factory.payment.PaymentProvider;
import com.example.factory.payment.PaymentResult;

import java.time.Duration;
import java.util.UUID;

public class PayPalPaymentClient implements PaymentClient {

    private final String apiKey;
    private final Duration timeout;

    public PayPalPaymentClient(String apiKey, Duration timeout) {
        if (apiKey == null || apiKey.isBlank())
            throw new IllegalArgumentException("PayPal apiKey اجباری است");
        this.apiKey  = apiKey;
        this.timeout = timeout;
    }

    @Override
    public PaymentResult charge(String customerId, long amountInCents) {
        return new PaymentResult(
                "paypal_" + UUID.randomUUID(),
                true,
                "پرداخت PayPal برای " + customerId
        );
    }

    @Override
    public String providerName() {
        return PaymentProvider.PAYPAL.name();
    }
}