package com.example.factory.payment.config;

import com.example.factory.payment.PaymentClientFactoryBean;
import com.example.factory.payment.PaymentProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class PaymentConfig {

    @Bean
    public PaymentClientFactoryBean paymentClient(
            @Value("${payment.provider}") String provider,
            @Value("${payment.api-key}") String apiKey,
            @Value("${payment.timeout:10s}") Duration timeout) {

        return new PaymentClientFactoryBean(
                PaymentProvider.valueOf(provider.toUpperCase()),
                apiKey,
                timeout);
    }
}