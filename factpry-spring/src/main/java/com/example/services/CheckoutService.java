package com.example.services;

import com.example.factory.payment.PaymentResult;
import com.example.factory.payment.paymentclient.PaymentClient;
import org.springframework.stereotype.Service;

//This for PaymentConfig class
@Service
public class CheckoutService {

    private final PaymentClient paymentClient;

    public CheckoutService(PaymentClient paymentClient) {
        this.paymentClient = paymentClient;
    }

    public void pay(String customer) {
        PaymentResult r = paymentClient.charge(customer, 50_000);
        System.out.println("[" + r.transactionId() + "] " + r.message());
    }
}