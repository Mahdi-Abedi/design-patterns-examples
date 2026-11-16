package com.example.factory.payment.paymentclient;

import com.example.factory.payment.PaymentResult;

public interface PaymentClient {
    PaymentResult charge(String customerId, long amountInCents);
    String providerName();
}