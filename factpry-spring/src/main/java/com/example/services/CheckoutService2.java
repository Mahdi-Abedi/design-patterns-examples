package com.example.services;

import com.example.factory.payment.paymentclient.PaymentClient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//This for MultiPaymentConfig class
@Service
public class CheckoutService2 {
    private final PaymentClient stripe;
    private final PaymentClient paypal;

    public CheckoutService2(
            @Qualifier("stripeClient") PaymentClient stripe,
            @Qualifier("paypalClient") PaymentClient paypal) {
        this.stripe = stripe;
        this.paypal = paypal;
    }
}