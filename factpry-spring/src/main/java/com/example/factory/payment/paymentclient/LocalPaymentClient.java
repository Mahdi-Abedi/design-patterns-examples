package com.example.factory.payment.paymentclient;

import com.example.factory.payment.PaymentResult;

import java.util.UUID;

public class LocalPaymentClient implements PaymentClient {

    private final String apiKey;

    public LocalPaymentClient(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public PaymentResult charge(String customerId, long amountInCents) {
        return new PaymentResult(
                "local_" + UUID.randomUUID(),
                true,
                "پرداخت داخلی (شتاب) برای " + customerId
        );
    }

    @Override
    public String providerName() { return "LOCAL"; }
}