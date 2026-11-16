package com.example.factory.payment.config;

import com.example.factory.payment.PaymentClientFactoryBean;
import com.example.factory.payment.PaymentProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class MultiPaymentConfig {

    @Bean
    public PaymentClientFactoryBean stripeClient(@Value("${payment.stripe.api-key}") String apiKey) {
        return new PaymentClientFactoryBean(PaymentProvider.STRIPE, apiKey, Duration.ofSeconds(15));
    }

    @Bean
    public PaymentClientFactoryBean paypalClient(@Value("${payment.paypal.api-key}") String apiKey) {
        return new PaymentClientFactoryBean(PaymentProvider.PAYPAL, apiKey, Duration.ofSeconds(20));
    }
}