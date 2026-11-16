package com.example.factory.payment;

public record PaymentResult(
        String transactionId,
        boolean success,
        String message
) {}