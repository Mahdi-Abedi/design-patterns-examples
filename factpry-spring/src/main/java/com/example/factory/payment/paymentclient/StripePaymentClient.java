package com.example.factory.payment.paymentclient;

import com.example.factory.payment.PaymentProvider;
import com.example.factory.payment.PaymentResult;

import java.time.Duration;
import java.util.UUID;

public class StripePaymentClient implements PaymentClient {

    private final String apiKey;
    private final Duration timeout;

    public StripePaymentClient(String apiKey, Duration timeout) {
        if (apiKey == null || apiKey.isBlank())
            throw new IllegalArgumentException("Stripe apiKey اجباری است");
        this.apiKey  = apiKey;
        this.timeout = timeout;
    }

    @Override
    public PaymentResult charge(String customerId, long amountInCents) {
        return new PaymentResult(
                "stripe_" + UUID.randomUUID(),
                true,
                "پرداخت Stripe برای " + customerId + " مبلغ " + amountInCents
        );
    }

    @Override
    public String providerName() {
        return PaymentProvider.STRIPE.name();
    }
}