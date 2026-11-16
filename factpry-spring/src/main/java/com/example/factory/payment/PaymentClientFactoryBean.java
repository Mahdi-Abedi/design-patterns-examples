package com.example.factory.payment;

import com.example.factory.payment.paymentclient.LocalPaymentClient;
import com.example.factory.payment.paymentclient.PayPalPaymentClient;
import com.example.factory.payment.paymentclient.PaymentClient;
import com.example.factory.payment.paymentclient.StripePaymentClient;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;

import java.time.Duration;

public class PaymentClientFactoryBean implements FactoryBean<PaymentClient>, InitializingBean {

    private final PaymentProvider provider;
    private final String apiKey;
    private final Duration timeout;
    private PaymentClient cached;

    public PaymentClientFactoryBean(PaymentProvider provider,
                                    String apiKey,
                                    Duration timeout) {
        this.provider = provider;
        this.apiKey = apiKey;
        this.timeout = timeout;
    }

    @Override
    public void afterPropertiesSet() {
        if (provider != PaymentProvider.LOCAL
                && (apiKey == null || apiKey.isBlank())) {
            throw new IllegalStateException(
                    "apiKey برای " + provider + " اجباری است");
        }
        if (timeout != null && timeout.isNegative()) {
            throw new IllegalStateException("timeout منفی نمی‌تواند باشد");
        }
    }

    @Override
    public PaymentClient getObject() {
        if (cached == null) {
            cached = create();
        }
        return cached;
    }

    private PaymentClient create() {
        return switch (provider) {
            case STRIPE -> new StripePaymentClient(apiKey, timeout);
            case PAYPAL -> new PayPalPaymentClient(apiKey, timeout);
            case LOCAL  -> new LocalPaymentClient(apiKey);
        };
    }

    @Override
    public Class<?> getObjectType() {
        return PaymentClient.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}